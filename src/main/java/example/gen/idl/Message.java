/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.gen.idl;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"example.gen.idl\",\"fields\":[{\"name\":\"topic\",\"type\":\"string\"},{\"name\":\"content\",\"type\":\"bytes\"},{\"name\":\"createdTime\",\"type\":\"long\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"ipAddress\",\"type\":\"string\"},{\"name\":\"props\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence topic;
  @Deprecated public java.nio.ByteBuffer content;
  @Deprecated public long createdTime;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence ipAddress;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> props;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Message() {}

  /**
   * All-args constructor.
   */
  public Message(java.lang.CharSequence topic, java.nio.ByteBuffer content, java.lang.Long createdTime, java.lang.CharSequence id, java.lang.CharSequence ipAddress, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> props) {
    this.topic = topic;
    this.content = content;
    this.createdTime = createdTime;
    this.id = id;
    this.ipAddress = ipAddress;
    this.props = props;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return topic;
    case 1: return content;
    case 2: return createdTime;
    case 3: return id;
    case 4: return ipAddress;
    case 5: return props;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: topic = (java.lang.CharSequence)value$; break;
    case 1: content = (java.nio.ByteBuffer)value$; break;
    case 2: createdTime = (java.lang.Long)value$; break;
    case 3: id = (java.lang.CharSequence)value$; break;
    case 4: ipAddress = (java.lang.CharSequence)value$; break;
    case 5: props = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'topic' field.
   */
  public java.lang.CharSequence getTopic() {
    return topic;
  }

  /**
   * Sets the value of the 'topic' field.
   * @param value the value to set.
   */
  public void setTopic(java.lang.CharSequence value) {
    this.topic = value;
  }

  /**
   * Gets the value of the 'content' field.
   */
  public java.nio.ByteBuffer getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.nio.ByteBuffer value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'createdTime' field.
   */
  public java.lang.Long getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the value of the 'createdTime' field.
   * @param value the value to set.
   */
  public void setCreatedTime(java.lang.Long value) {
    this.createdTime = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'ipAddress' field.
   */
  public java.lang.CharSequence getIpAddress() {
    return ipAddress;
  }

  /**
   * Sets the value of the 'ipAddress' field.
   * @param value the value to set.
   */
  public void setIpAddress(java.lang.CharSequence value) {
    this.ipAddress = value;
  }

  /**
   * Gets the value of the 'props' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getProps() {
    return props;
  }

  /**
   * Sets the value of the 'props' field.
   * @param value the value to set.
   */
  public void setProps(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.props = value;
  }

  /** Creates a new Message RecordBuilder */
  public static example.gen.idl.Message.Builder newBuilder() {
    return new example.gen.idl.Message.Builder();
  }
  
  /** Creates a new Message RecordBuilder by copying an existing Builder */
  public static example.gen.idl.Message.Builder newBuilder(example.gen.idl.Message.Builder other) {
    return new example.gen.idl.Message.Builder(other);
  }
  
  /** Creates a new Message RecordBuilder by copying an existing Message instance */
  public static example.gen.idl.Message.Builder newBuilder(example.gen.idl.Message other) {
    return new example.gen.idl.Message.Builder(other);
  }
  
  /**
   * RecordBuilder for Message instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private java.lang.CharSequence topic;
    private java.nio.ByteBuffer content;
    private long createdTime;
    private java.lang.CharSequence id;
    private java.lang.CharSequence ipAddress;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> props;

    /** Creates a new Builder */
    private Builder() {
      super(example.gen.idl.Message.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.gen.idl.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.topic)) {
        this.topic = data().deepCopy(fields()[0].schema(), other.topic);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.createdTime)) {
        this.createdTime = data().deepCopy(fields()[2].schema(), other.createdTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.id)) {
        this.id = data().deepCopy(fields()[3].schema(), other.id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[4].schema(), other.ipAddress);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.props)) {
        this.props = data().deepCopy(fields()[5].schema(), other.props);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Message instance */
    private Builder(example.gen.idl.Message other) {
            super(example.gen.idl.Message.SCHEMA$);
      if (isValidValue(fields()[0], other.topic)) {
        this.topic = data().deepCopy(fields()[0].schema(), other.topic);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.createdTime)) {
        this.createdTime = data().deepCopy(fields()[2].schema(), other.createdTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.id)) {
        this.id = data().deepCopy(fields()[3].schema(), other.id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[4].schema(), other.ipAddress);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.props)) {
        this.props = data().deepCopy(fields()[5].schema(), other.props);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'topic' field */
    public java.lang.CharSequence getTopic() {
      return topic;
    }
    
    /** Sets the value of the 'topic' field */
    public example.gen.idl.Message.Builder setTopic(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.topic = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'topic' field has been set */
    public boolean hasTopic() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'topic' field */
    public example.gen.idl.Message.Builder clearTopic() {
      topic = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'content' field */
    public java.nio.ByteBuffer getContent() {
      return content;
    }
    
    /** Sets the value of the 'content' field */
    public example.gen.idl.Message.Builder setContent(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.content = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'content' field has been set */
    public boolean hasContent() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'content' field */
    public example.gen.idl.Message.Builder clearContent() {
      content = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'createdTime' field */
    public java.lang.Long getCreatedTime() {
      return createdTime;
    }
    
    /** Sets the value of the 'createdTime' field */
    public example.gen.idl.Message.Builder setCreatedTime(long value) {
      validate(fields()[2], value);
      this.createdTime = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'createdTime' field has been set */
    public boolean hasCreatedTime() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'createdTime' field */
    public example.gen.idl.Message.Builder clearCreatedTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public example.gen.idl.Message.Builder setId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.id = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'id' field */
    public example.gen.idl.Message.Builder clearId() {
      id = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'ipAddress' field */
    public java.lang.CharSequence getIpAddress() {
      return ipAddress;
    }
    
    /** Sets the value of the 'ipAddress' field */
    public example.gen.idl.Message.Builder setIpAddress(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.ipAddress = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'ipAddress' field has been set */
    public boolean hasIpAddress() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'ipAddress' field */
    public example.gen.idl.Message.Builder clearIpAddress() {
      ipAddress = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'props' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getProps() {
      return props;
    }
    
    /** Sets the value of the 'props' field */
    public example.gen.idl.Message.Builder setProps(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.props = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'props' field has been set */
    public boolean hasProps() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'props' field */
    public example.gen.idl.Message.Builder clearProps() {
      props = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Message build() {
      try {
        Message record = new Message();
        record.topic = fieldSetFlags()[0] ? this.topic : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.content = fieldSetFlags()[1] ? this.content : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.createdTime = fieldSetFlags()[2] ? this.createdTime : (java.lang.Long) defaultValue(fields()[2]);
        record.id = fieldSetFlags()[3] ? this.id : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.ipAddress = fieldSetFlags()[4] ? this.ipAddress : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.props = fieldSetFlags()[5] ? this.props : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}