/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tplatform;

import com.absir.data.value.IThrift;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import javax.annotation.Generated;
import java.util.*;
import com.absir.data.value.IThrift;
import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class DRegisterResult implements org.apache.thrift.TBase<DRegisterResult, DRegisterResult._Fields>, java.io.Serializable, Cloneable, Comparable<DRegisterResult>, IThrift {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DRegisterResult");

    private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short) 1);

    private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.STRUCT, (short) 2);

    private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short) 3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    // optional
    protected ERegisterError error;

    // optional
    protected DIdentityResult result;

    // optional
    protected long userId;

    // isset id assignments
    private static final int __USERID_ISSET_ID = 0;

    protected byte __isset_bitfield = 0;

    private static final _Fields optionals[] = { _Fields.ERROR, _Fields.RESULT, _Fields.USER_ID };

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        schemes.put(StandardScheme.class, new DRegisterResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new DRegisterResultTupleSchemeFactory());
    }

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        /**
     * 
     * @see ERegisterError
     */
        ERROR((short) 1, "error"), RESULT((short) 2, "result"), USER_ID((short) 3, "userId");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
        public static _Fields findByThriftId(int fieldId) {
            switch(fieldId) {
                case // ERROR
                1:
                    return ERROR;
                case // RESULT
                2:
                    return RESULT;
                case // USER_ID
                3:
                    return USER_ID;
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
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;

        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    public DRegisterResult() {
    }

    /**
   * Performs a deep copy on <i>other</i>.
   */
    public DRegisterResult(DRegisterResult other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetError()) {
            this.error = other.error;
        }
        if (other.isSetResult()) {
            this.result = new DIdentityResult(other.result);
        }
        this.userId = other.userId;
    }

    public DRegisterResult deepCopy() {
        return new DRegisterResult(this);
    }

    @Override
    public void clear() {
        this.error = null;
        this.result = null;
        setUserIdIsSet(false);
        this.userId = 0;
    }

    /**
   * 
   * @see ERegisterError
   */
    public ERegisterError getError() {
        return this.error;
    }

    /**
   * 
   * @see ERegisterError
   */
    public DRegisterResult setError(ERegisterError error) {
        this.error = error;
        return this;
    }

    public void unsetError() {
        this.error = null;
    }

    /** Returns true if field error is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetError() {
        return this.error != null;
    }

    public void setErrorIsSet(boolean value) {
        if (!value) {
            this.error = null;
        }
    }

    public DIdentityResult getResult() {
        return this.result;
    }

    public DRegisterResult setResult(DIdentityResult result) {
        this.result = result;
        return this;
    }

    public void unsetResult() {
        this.result = null;
    }

    /** Returns true if field result is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetResult() {
        return this.result != null;
    }

    public void setResultIsSet(boolean value) {
        if (!value) {
            this.result = null;
        }
    }

    public long getUserId() {
        return this.userId;
    }

    public DRegisterResult setUserId(long userId) {
        this.userId = userId;
        setUserIdIsSet(true);
        return this;
    }

    public void unsetUserId() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    /** Returns true if field userId is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetUserId() {
        return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    public void setUserIdIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case ERROR:
                if (value == null) {
                    unsetError();
                } else {
                    setError((ERegisterError) value);
                }
                break;
            case RESULT:
                if (value == null) {
                    unsetResult();
                } else {
                    setResult((DIdentityResult) value);
                }
                break;
            case USER_ID:
                if (value == null) {
                    unsetUserId();
                } else {
                    setUserId((Long) value);
                }
                break;
        }
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case ERROR:
                return getError();
            case RESULT:
                return getResult();
            case USER_ID:
                return getUserId();
        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch(field) {
            case ERROR:
                return isSetError();
            case RESULT:
                return isSetResult();
            case USER_ID:
                return isSetUserId();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof DRegisterResult)
            return this.equals((DRegisterResult) that);
        return false;
    }

    public boolean equals(DRegisterResult that) {
        if (that == null)
            return false;
        boolean this_present_error = true && this.isSetError();
        boolean that_present_error = true && that.isSetError();
        if (this_present_error || that_present_error) {
            if (!(this_present_error && that_present_error))
                return false;
            if (!this.error.equals(that.error))
                return false;
        }
        boolean this_present_result = true && this.isSetResult();
        boolean that_present_result = true && that.isSetResult();
        if (this_present_result || that_present_result) {
            if (!(this_present_result && that_present_result))
                return false;
            if (!this.result.equals(that.result))
                return false;
        }
        boolean this_present_userId = true && this.isSetUserId();
        boolean that_present_userId = true && that.isSetUserId();
        if (this_present_userId || that_present_userId) {
            if (!(this_present_userId && that_present_userId))
                return false;
            if (this.userId != that.userId)
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();
        boolean present_error = true && (isSetError());
        list.add(present_error);
        if (present_error)
            list.add(error.getValue());
        boolean present_result = true && (isSetResult());
        list.add(present_result);
        if (present_result)
            list.add(result);
        boolean present_userId = true && (isSetUserId());
        list.add(present_userId);
        if (present_userId)
            list.add(userId);
        return list.hashCode();
    }

    @Override
    public int compareTo(DRegisterResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int lastComparison = 0;
        lastComparison = Boolean.valueOf(isSetError()).compareTo(other.isSetError());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetError()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetResult()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, other.result);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUserId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
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
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DRegisterResult(");
        boolean first = true;
        if (isSetError()) {
            sb.append("error:");
            if (this.error == null) {
                sb.append("null");
            } else {
                sb.append(this.error);
            }
            first = false;
        }
        if (isSetResult()) {
            if (!first)
                sb.append(", ");
            sb.append("result:");
            if (this.result == null) {
                sb.append("null");
            } else {
                sb.append(this.result);
            }
            first = false;
        }
        if (isSetUserId()) {
            if (!first)
                sb.append(", ");
            sb.append("userId:");
            sb.append(this.userId);
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for sub-struct validity
        if (result != null) {
            result.validate();
        }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class DRegisterResultStandardSchemeFactory implements SchemeFactory {

        public DRegisterResultStandardScheme getScheme() {
            return new DRegisterResultStandardScheme();
        }
    }

    private static class DRegisterResultStandardScheme extends StandardScheme<DRegisterResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, DRegisterResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch(schemeField.id) {
                    case // ERROR
                    1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.error = tplatform.ERegisterError.findByValue(iprot.readI32());
                            struct.setErrorIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // RESULT
                    2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.result = new DIdentityResult();
                            struct.result.read(iprot);
                            struct.setResultIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // USER_ID
                    3:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.userId = iprot.readI64();
                            struct.setUserIdIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, DRegisterResult struct) throws org.apache.thrift.TException {
            struct.validate();
            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.error != null) {
                if (struct.isSetError()) {
                    oprot.writeFieldBegin(ERROR_FIELD_DESC);
                    oprot.writeI32(struct.error.getValue());
                    oprot.writeFieldEnd();
                }
            }
            if (struct.result != null) {
                if (struct.isSetResult()) {
                    oprot.writeFieldBegin(RESULT_FIELD_DESC);
                    struct.result.write(oprot);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.isSetUserId()) {
                oprot.writeFieldBegin(USER_ID_FIELD_DESC);
                oprot.writeI64(struct.userId);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    private static class DRegisterResultTupleSchemeFactory implements SchemeFactory {

        public DRegisterResultTupleScheme getScheme() {
            return new DRegisterResultTupleScheme();
        }
    }

    private static class DRegisterResultTupleScheme extends TupleScheme<DRegisterResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, DRegisterResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetError()) {
                optionals.set(0);
            }
            if (struct.isSetResult()) {
                optionals.set(1);
            }
            if (struct.isSetUserId()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetError()) {
                oprot.writeI32(struct.error.getValue());
            }
            if (struct.isSetResult()) {
                struct.result.write(oprot);
            }
            if (struct.isSetUserId()) {
                oprot.writeI64(struct.userId);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, DRegisterResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.error = tplatform.ERegisterError.findByValue(iprot.readI32());
                struct.setErrorIsSet(true);
            }
            if (incoming.get(1)) {
                struct.result = new DIdentityResult();
                struct.result.read(iprot);
                struct.setResultIsSet(true);
            }
            if (incoming.get(2)) {
                struct.userId = iprot.readI64();
                struct.setUserIdIsSet(true);
            }
        }
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ERegisterError.class)));
        tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DIdentityResult.class)));
        tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DRegisterResult.class, metaDataMap);
    }

    public DRegisterResult create() {
        return new DRegisterResult();
    }

    public DRegisterResult clone() {
        return cloneDepth(0);
    }

    public DRegisterResult cloneDepth(int _depth) {
        DRegisterResult _clone = create();
        _clone.setError(error);
        _clone.setResult(result);
        _clone.setUserId(userId);
        cloneMore(_clone, _depth);
        return _clone;
    }

    public void cloneMore(DRegisterResult _clone, int _depth) {
    }
}
