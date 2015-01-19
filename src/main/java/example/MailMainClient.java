package example;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.util.Utf8;

import example.gen.proto.Mail;
import example.gen.proto.Message;

/**
 * mail protocol implement
 * attach a client, and send a message.
 * @author pzx
 * 
 */
public class MailMainClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		if (args.length != 3) {
            System.out.println("Usage: <to> <from> <body>");
            System.exit(1);
        }
		NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(65111));
        // client code - attach to the server and send a message
        Mail proxy = (Mail) SpecificRequestor.getClient(Mail.class, client);
        System.out.println("Client built, got proxy");

        // fill in the Message record and send it
        Message message = new Message();
        message.setTo(new Utf8(args[0]));
        message.setFrom(new Utf8(args[1]));
        message.setBody(new Utf8(args[2]));
        System.out.println("Calling proxy.send with message:  " + message.toString());
        System.out.println("Result: " + proxy.send(message));

        // cleanup
        client.close();
		

	}

}
