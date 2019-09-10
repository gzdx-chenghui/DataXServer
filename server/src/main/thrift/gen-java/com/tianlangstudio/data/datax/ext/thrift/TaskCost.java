/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tianlangstudio.data.datax.ext.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-04-12")
public class TaskCost implements org.apache.thrift.TBase<TaskCost, TaskCost._Fields>, java.io.Serializable, Cloneable, Comparable<TaskCost> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskCost");

  private static final org.apache.thrift.protocol.TField BEGIN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("beginTime", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COST_FIELD_DESC = new org.apache.thrift.protocol.TField("cost", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TaskCostStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TaskCostTupleSchemeFactory();

  public java.lang.String beginTime; // required
  public java.lang.String endTime; // required
  public java.lang.String cost; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BEGIN_TIME((short)1, "beginTime"),
    END_TIME((short)2, "endTime"),
    COST((short)3, "cost");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BEGIN_TIME
          return BEGIN_TIME;
        case 2: // END_TIME
          return END_TIME;
        case 3: // COST
          return COST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BEGIN_TIME, new org.apache.thrift.meta_data.FieldMetaData("beginTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COST, new org.apache.thrift.meta_data.FieldMetaData("cost", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskCost.class, metaDataMap);
  }

  public TaskCost() {
  }

  public TaskCost(
    java.lang.String beginTime,
    java.lang.String endTime,
    java.lang.String cost)
  {
    this();
    this.beginTime = beginTime;
    this.endTime = endTime;
    this.cost = cost;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskCost(TaskCost other) {
    if (other.isSetBeginTime()) {
      this.beginTime = other.beginTime;
    }
    if (other.isSetEndTime()) {
      this.endTime = other.endTime;
    }
    if (other.isSetCost()) {
      this.cost = other.cost;
    }
  }

  public TaskCost deepCopy() {
    return new TaskCost(this);
  }

  @Override
  public void clear() {
    this.beginTime = null;
    this.endTime = null;
    this.cost = null;
  }

  public java.lang.String getBeginTime() {
    return this.beginTime;
  }

  public TaskCost setBeginTime(java.lang.String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

  public void unsetBeginTime() {
    this.beginTime = null;
  }

  /** Returns true if field beginTime is set (has been assigned a value) and false otherwise */
  public boolean isSetBeginTime() {
    return this.beginTime != null;
  }

  public void setBeginTimeIsSet(boolean value) {
    if (!value) {
      this.beginTime = null;
    }
  }

  public java.lang.String getEndTime() {
    return this.endTime;
  }

  public TaskCost setEndTime(java.lang.String endTime) {
    this.endTime = endTime;
    return this;
  }

  public void unsetEndTime() {
    this.endTime = null;
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return this.endTime != null;
  }

  public void setEndTimeIsSet(boolean value) {
    if (!value) {
      this.endTime = null;
    }
  }

  public java.lang.String getCost() {
    return this.cost;
  }

  public TaskCost setCost(java.lang.String cost) {
    this.cost = cost;
    return this;
  }

  public void unsetCost() {
    this.cost = null;
  }

  /** Returns true if field cost is set (has been assigned a value) and false otherwise */
  public boolean isSetCost() {
    return this.cost != null;
  }

  public void setCostIsSet(boolean value) {
    if (!value) {
      this.cost = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BEGIN_TIME:
      if (value == null) {
        unsetBeginTime();
      } else {
        setBeginTime((java.lang.String)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((java.lang.String)value);
      }
      break;

    case COST:
      if (value == null) {
        unsetCost();
      } else {
        setCost((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BEGIN_TIME:
      return getBeginTime();

    case END_TIME:
      return getEndTime();

    case COST:
      return getCost();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BEGIN_TIME:
      return isSetBeginTime();
    case END_TIME:
      return isSetEndTime();
    case COST:
      return isSetCost();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskCost)
      return this.equals((TaskCost)that);
    return false;
  }

  public boolean equals(TaskCost that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_beginTime = true && this.isSetBeginTime();
    boolean that_present_beginTime = true && that.isSetBeginTime();
    if (this_present_beginTime || that_present_beginTime) {
      if (!(this_present_beginTime && that_present_beginTime))
        return false;
      if (!this.beginTime.equals(that.beginTime))
        return false;
    }

    boolean this_present_endTime = true && this.isSetEndTime();
    boolean that_present_endTime = true && that.isSetEndTime();
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (!this.endTime.equals(that.endTime))
        return false;
    }

    boolean this_present_cost = true && this.isSetCost();
    boolean that_present_cost = true && that.isSetCost();
    if (this_present_cost || that_present_cost) {
      if (!(this_present_cost && that_present_cost))
        return false;
      if (!this.cost.equals(that.cost))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBeginTime()) ? 131071 : 524287);
    if (isSetBeginTime())
      hashCode = hashCode * 8191 + beginTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndTime()) ? 131071 : 524287);
    if (isSetEndTime())
      hashCode = hashCode * 8191 + endTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetCost()) ? 131071 : 524287);
    if (isSetCost())
      hashCode = hashCode * 8191 + cost.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TaskCost other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBeginTime()).compareTo(other.isSetBeginTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeginTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.beginTime, other.beginTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCost()).compareTo(other.isSetCost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cost, other.cost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TaskCost(");
    boolean first = true;

    sb.append("beginTime:");
    if (this.beginTime == null) {
      sb.append("null");
    } else {
      sb.append(this.beginTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    if (this.endTime == null) {
      sb.append("null");
    } else {
      sb.append(this.endTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cost:");
    if (this.cost == null) {
      sb.append("null");
    } else {
      sb.append(this.cost);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TaskCostStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TaskCostStandardScheme getScheme() {
      return new TaskCostStandardScheme();
    }
  }

  private static class TaskCostStandardScheme extends org.apache.thrift.scheme.StandardScheme<TaskCost> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskCost struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BEGIN_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.beginTime = iprot.readString();
              struct.setBeginTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endTime = iprot.readString();
              struct.setEndTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cost = iprot.readString();
              struct.setCostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskCost struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.beginTime != null) {
        oprot.writeFieldBegin(BEGIN_TIME_FIELD_DESC);
        oprot.writeString(struct.beginTime);
        oprot.writeFieldEnd();
      }
      if (struct.endTime != null) {
        oprot.writeFieldBegin(END_TIME_FIELD_DESC);
        oprot.writeString(struct.endTime);
        oprot.writeFieldEnd();
      }
      if (struct.cost != null) {
        oprot.writeFieldBegin(COST_FIELD_DESC);
        oprot.writeString(struct.cost);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskCostTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TaskCostTupleScheme getScheme() {
      return new TaskCostTupleScheme();
    }
  }

  private static class TaskCostTupleScheme extends org.apache.thrift.scheme.TupleScheme<TaskCost> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskCost struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBeginTime()) {
        optionals.set(0);
      }
      if (struct.isSetEndTime()) {
        optionals.set(1);
      }
      if (struct.isSetCost()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBeginTime()) {
        oprot.writeString(struct.beginTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeString(struct.endTime);
      }
      if (struct.isSetCost()) {
        oprot.writeString(struct.cost);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskCost struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.beginTime = iprot.readString();
        struct.setBeginTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endTime = iprot.readString();
        struct.setEndTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cost = iprot.readString();
        struct.setCostIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
