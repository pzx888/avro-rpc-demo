/**
 * 
 */
package example.netty;


import java.net.InetSocketAddress;
import java.net.URL;

import org.apache.avro.Protocol;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.ipc.HttpTransceiver;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.Transceiver;
import org.apache.avro.ipc.generic.GenericRequestor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import example.http.Utils;

/**
 * generic interface call with netty server
 * @author pzx
 *
 */
public class Client {
	private static Logger log = LoggerFactory.getLogger(Client.class);
    private Protocol protocol = null;
    private String host = null;
    private int port = 0;
    private int size = 0;
    private int count = 0;
 
    public Client(Protocol protocol, String host, int port, int size, int count) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.size = size;
        this.count = count;
    }
 
    public long sendMessage() throws Exception {
        GenericRecord requestData = new GenericData.Record(
                protocol.getType("Message"));
        // initiate the request data
        requestData.put("name", "Alyssa");
        requestData.put("type", 1);
        requestData.put("price", 256.15);
        requestData.put("valid", true);
        requestData.put("content", "Hello world");
        
        GenericRecord request = new GenericData.Record(protocol.getMessages()
                .get("sendMessage").getRequest());
        request.put("message", requestData);
 
        
        NettyTransceiver t = new NettyTransceiver(new InetSocketAddress(port));
        GenericRequestor requestor = new GenericRequestor(protocol, t);
 
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Object result = requestor.request("sendMessage", request);
            GenericRecord msg = (GenericRecord)result;
            log.info(msg.get("name").toString()+msg.get("type").toString()+msg.get("price").toString()+
            		msg.get("valid").toString()+msg.get("content").toString());
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        t.close();
        return end - start;
    }
 
    public long run() {
        long res = 0;
        try {
            res = sendMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
 
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("Usage: Client host port dataSize count");
            System.exit(0);
        }
 
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        int size = Integer.parseInt(args[2]);
        int count = Integer.parseInt(args[3]);
        new Client(Utils.getProtocol(), host, port, size, count).run();
    }
}
