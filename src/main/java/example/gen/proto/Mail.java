/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.gen.proto;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface Mail {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Mail\",\"namespace\":\"example.gen.proto\",\"types\":[{\"type\":\"record\",\"name\":\"Message\",\"fields\":[{\"name\":\"to\",\"type\":\"string\"},{\"name\":\"from\",\"type\":\"string\"},{\"name\":\"body\",\"type\":\"string\"}]}],\"messages\":{\"send\":{\"request\":[{\"name\":\"message\",\"type\":\"Message\"}],\"response\":\"string\"}}}");
  java.lang.CharSequence send(example.gen.proto.Message message) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends Mail {
    public static final org.apache.avro.Protocol PROTOCOL = example.gen.proto.Mail.PROTOCOL;
    void send(example.gen.proto.Message message, org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;
  }
}