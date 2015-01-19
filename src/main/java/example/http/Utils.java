package example.http;

import java.io.File;
import java.io.IOException;
import java.net.URL;
 
import org.apache.avro.Protocol;
 
/**
 * Protocol util, to get protocol from schema
 * @author pzx
 *
 */
public class Utils {
    public static Protocol getProtocol() {
        Protocol protocol = null;
        try {
            //URL url = Utils.class.getClassLoader().getResource("message.avpr");
            //protocol = Protocol.parse(new File(url.getPath()));
            protocol = Protocol.parse(new File("./src/main/avro/message.avpr"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return protocol;
    }
}
