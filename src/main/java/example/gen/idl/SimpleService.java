/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.gen.idl;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface SimpleService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SimpleService\",\"namespace\":\"example.gen.idl\",\"types\":[{\"type\":\"record\",\"name\":\"Message\",\"fields\":[{\"name\":\"topic\",\"type\":\"string\"},{\"name\":\"content\",\"type\":\"bytes\"},{\"name\":\"createdTime\",\"type\":\"long\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"ipAddress\",\"type\":\"string\"},{\"name\":\"props\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}],\"messages\":{\"publish\":{\"request\":[{\"name\":\"context\",\"type\":\"string\"},{\"name\":\"messages\",\"type\":{\"type\":\"array\",\"items\":\"Message\"}}],\"response\":\"int\"}}}");
  int publish(java.lang.CharSequence context, java.util.List<example.gen.idl.Message> messages) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends SimpleService {
    public static final org.apache.avro.Protocol PROTOCOL = example.gen.idl.SimpleService.PROTOCOL;
    void publish(java.lang.CharSequence context, java.util.List<example.gen.idl.Message> messages, org.apache.avro.ipc.Callback<java.lang.Integer> callback) throws java.io.IOException;
  }
}