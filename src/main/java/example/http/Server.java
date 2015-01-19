/**
 * 
 */
package example.http;


import org.apache.avro.Protocol;
import org.apache.avro.Protocol.Message;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.ipc.HttpServer;
import org.apache.avro.ipc.generic.GenericResponder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * generic implement with http-server
 * @author pzx
 *
 */
public class Server extends GenericResponder {
	private static Logger log = LoggerFactory.getLogger(Server.class);
    private Protocol protocol = null;
    private int port;
 
    public Server(Protocol protocol, int port) {
        super(protocol);
        this.protocol = protocol;
        this.port = port;
    }
 
    public Object respond(Message message, Object request) throws Exception {
        GenericRecord req = (GenericRecord) request;
        GenericRecord msg = (GenericRecord)(req.get("message"));
        // process the request
        if(message.getName().equals("sendMessage")){
        	log.info(msg.get("name").toString()+msg.get("type").toString()+msg.get("price").toString()+
            		msg.get("valid").toString()+msg.get("content").toString());
            msg.put("content", "sendMessage Response from Server");
        }else if(message.getName().equals("pullMessage")){
        	log.info(msg.get("name").toString()+msg.get("type").toString()+msg.get("price").toString()+
            		msg.get("valid").toString()+msg.get("content").toString());
            msg.put("content", "pullMessage Response from Server");
        }
        return msg;
    }
 
    public void run() {
        try {
            HttpServer server = new HttpServer(this, port);
 
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Server port");
            System.exit(0);
        }
        int port = Integer.parseInt(args[0]);
        new Server(Utils.getProtocol(), port).run();
    }
}
