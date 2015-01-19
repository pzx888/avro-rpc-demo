/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.gen.proto;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"example.gen.proto\",\"fields\":[{\"name\":\"to\",\"type\":\"string\"},{\"name\":\"from\",\"type\":\"string\"},{\"name\":\"body\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence to;
  @Deprecated public java.lang.CharSequence from;
  @Deprecated public java.lang.CharSequence body;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Message() {}

  /**
   * All-args constructor.
   */
  public Message(java.lang.CharSequence to, java.lang.CharSequence from, java.lang.CharSequence body) {
    this.to = to;
    this.from = from;
    this.body = body;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return to;
    case 1: return from;
    case 2: return body;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: to = (java.lang.CharSequence)value$; break;
    case 1: from = (java.lang.CharSequence)value$; break;
    case 2: body = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'to' field.
   */
  public java.lang.CharSequence getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(java.lang.CharSequence value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'from' field.
   */
  public java.lang.CharSequence getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(java.lang.CharSequence value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'body' field.
   */
  public java.lang.CharSequence getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.CharSequence value) {
    this.body = value;
  }

  /** Creates a new Message RecordBuilder */
  public static example.gen.proto.Message.Builder newBuilder() {
    return new example.gen.proto.Message.Builder();
  }
  
  /** Creates a new Message RecordBuilder by copying an existing Builder */
  public static example.gen.proto.Message.Builder newBuilder(example.gen.proto.Message.Builder other) {
    return new example.gen.proto.Message.Builder(other);
  }
  
  /** Creates a new Message RecordBuilder by copying an existing Message instance */
  public static example.gen.proto.Message.Builder newBuilder(example.gen.proto.Message other) {
    return new example.gen.proto.Message.Builder(other);
  }
  
  /**
   * RecordBuilder for Message instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private java.lang.CharSequence to;
    private java.lang.CharSequence from;
    private java.lang.CharSequence body;

    /** Creates a new Builder */
    private Builder() {
      super(example.gen.proto.Message.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.gen.proto.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.to)) {
        this.to = data().deepCopy(fields()[0].schema(), other.to);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Message instance */
    private Builder(example.gen.proto.Message other) {
            super(example.gen.proto.Message.SCHEMA$);
      if (isValidValue(fields()[0], other.to)) {
        this.to = data().deepCopy(fields()[0].schema(), other.to);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.body)) {
        this.body = data().deepCopy(fields()[2].schema(), other.body);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'to' field */
    public java.lang.CharSequence getTo() {
      return to;
    }
    
    /** Sets the value of the 'to' field */
    public example.gen.proto.Message.Builder setTo(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.to = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'to' field has been set */
    public boolean hasTo() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'to' field */
    public example.gen.proto.Message.Builder clearTo() {
      to = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'from' field */
    public java.lang.CharSequence getFrom() {
      return from;
    }
    
    /** Sets the value of the 'from' field */
    public example.gen.proto.Message.Builder setFrom(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.from = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'from' field has been set */
    public boolean hasFrom() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'from' field */
    public example.gen.proto.Message.Builder clearFrom() {
      from = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'body' field */
    public java.lang.CharSequence getBody() {
      return body;
    }
    
    /** Sets the value of the 'body' field */
    public example.gen.proto.Message.Builder setBody(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.body = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'body' field has been set */
    public boolean hasBody() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'body' field */
    public example.gen.proto.Message.Builder clearBody() {
      body = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Message build() {
      try {
        Message record = new Message();
        record.to = fieldSetFlags()[0] ? this.to : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.from = fieldSetFlags()[1] ? this.from : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.body = fieldSetFlags()[2] ? this.body : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
