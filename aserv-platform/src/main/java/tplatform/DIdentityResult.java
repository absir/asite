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
import com.absir.data.value.IThrift;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.absir.data.value.IThrift;
import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class DIdentityResult implements org.apache.thrift.TBase<DIdentityResult, DIdentityResult._Fields>, java.io.Serializable, Cloneable, Comparable<DIdentityResult>, IThrift {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DIdentityResult");

    private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short) 1);

    private static final org.apache.thrift.protocol.TField USER_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("userData", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short) 3);

    private static final org.apache.thrift.protocol.TField SERVER_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("serverIds", org.apache.thrift.protocol.TType.LIST, (short) 4);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    // required
    protected long userId;

    // optional
    protected String userData;

    // optional
    protected String sessionId;

    // optional
    protected List<Long> serverIds;

    // isset id assignments
    private static final int __USERID_ISSET_ID = 0;

    protected byte __isset_bitfield = 0;

    private static final _Fields optionals[] = { _Fields.USER_DATA, _Fields.SESSION_ID, _Fields.SERVER_IDS };

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        schemes.put(StandardScheme.class, new DIdentityResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new DIdentityResultTupleSchemeFactory());
    }

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        USER_ID((short) 1, "userId"), USER_DATA((short) 2, "userData"), SESSION_ID((short) 3, "sessionId"), SERVER_IDS((short) 4, "serverIds");

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
                case // USER_ID
                1:
                    return USER_ID;
                case // USER_DATA
                2:
                    return USER_DATA;
                case // SESSION_ID
                3:
                    return SESSION_ID;
                case // SERVER_IDS
                4:
                    return SERVER_IDS;
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

    public DIdentityResult() {
    }

    public DIdentityResult(long userId) {
        this();
        this.userId = userId;
        setUserIdIsSet(true);
    }

    /**
   * Performs a deep copy on <i>other</i>.
   */
    public DIdentityResult(DIdentityResult other) {
        __isset_bitfield = other.__isset_bitfield;
        this.userId = other.userId;
        if (other.isSetUserData()) {
            this.userData = other.userData;
        }
        if (other.isSetSessionId()) {
            this.sessionId = other.sessionId;
        }
        if (other.isSetServerIds()) {
            List<Long> __this__serverIds = new ArrayList<Long>(other.serverIds);
            this.serverIds = __this__serverIds;
        }
    }

    public DIdentityResult deepCopy() {
        return new DIdentityResult(this);
    }

    @Override
    public void clear() {
        setUserIdIsSet(false);
        this.userId = 0;
        this.userData = null;
        this.sessionId = null;
        this.serverIds = null;
    }

    public long getUserId() {
        return this.userId;
    }

    public DIdentityResult setUserId(long userId) {
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

    public String getUserData() {
        return this.userData;
    }

    public DIdentityResult setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public void unsetUserData() {
        this.userData = null;
    }

    /** Returns true if field userData is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetUserData() {
        return this.userData != null;
    }

    public void setUserDataIsSet(boolean value) {
        if (!value) {
            this.userData = null;
        }
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public DIdentityResult setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public void unsetSessionId() {
        this.sessionId = null;
    }

    /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetSessionId() {
        return this.sessionId != null;
    }

    public void setSessionIdIsSet(boolean value) {
        if (!value) {
            this.sessionId = null;
        }
    }

    public int getServerIdsSize() {
        return (this.serverIds == null) ? 0 : this.serverIds.size();
    }

    public java.util.Iterator<Long> getServerIdsIterator() {
        return (this.serverIds == null) ? null : this.serverIds.iterator();
    }

    public void addToServerIds(long elem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<Long>();
        }
        this.serverIds.add(elem);
    }

    public List<Long> getServerIds() {
        return this.serverIds;
    }

    public DIdentityResult setServerIds(List<Long> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public void unsetServerIds() {
        this.serverIds = null;
    }

    /** Returns true if field serverIds is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetServerIds() {
        return this.serverIds != null;
    }

    public void setServerIdsIsSet(boolean value) {
        if (!value) {
            this.serverIds = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case USER_ID:
                if (value == null) {
                    unsetUserId();
                } else {
                    setUserId((Long) value);
                }
                break;
            case USER_DATA:
                if (value == null) {
                    unsetUserData();
                } else {
                    setUserData((String) value);
                }
                break;
            case SESSION_ID:
                if (value == null) {
                    unsetSessionId();
                } else {
                    setSessionId((String) value);
                }
                break;
            case SERVER_IDS:
                if (value == null) {
                    unsetServerIds();
                } else {
                    setServerIds((List<Long>) value);
                }
                break;
        }
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case USER_ID:
                return getUserId();
            case USER_DATA:
                return getUserData();
            case SESSION_ID:
                return getSessionId();
            case SERVER_IDS:
                return getServerIds();
        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch(field) {
            case USER_ID:
                return isSetUserId();
            case USER_DATA:
                return isSetUserData();
            case SESSION_ID:
                return isSetSessionId();
            case SERVER_IDS:
                return isSetServerIds();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof DIdentityResult)
            return this.equals((DIdentityResult) that);
        return false;
    }

    public boolean equals(DIdentityResult that) {
        if (that == null)
            return false;
        boolean this_present_userId = true;
        boolean that_present_userId = true;
        if (this_present_userId || that_present_userId) {
            if (!(this_present_userId && that_present_userId))
                return false;
            if (this.userId != that.userId)
                return false;
        }
        boolean this_present_userData = true && this.isSetUserData();
        boolean that_present_userData = true && that.isSetUserData();
        if (this_present_userData || that_present_userData) {
            if (!(this_present_userData && that_present_userData))
                return false;
            if (!this.userData.equals(that.userData))
                return false;
        }
        boolean this_present_sessionId = true && this.isSetSessionId();
        boolean that_present_sessionId = true && that.isSetSessionId();
        if (this_present_sessionId || that_present_sessionId) {
            if (!(this_present_sessionId && that_present_sessionId))
                return false;
            if (!this.sessionId.equals(that.sessionId))
                return false;
        }
        boolean this_present_serverIds = true && this.isSetServerIds();
        boolean that_present_serverIds = true && that.isSetServerIds();
        if (this_present_serverIds || that_present_serverIds) {
            if (!(this_present_serverIds && that_present_serverIds))
                return false;
            if (!this.serverIds.equals(that.serverIds))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();
        boolean present_userId = true;
        list.add(present_userId);
        if (present_userId)
            list.add(userId);
        boolean present_userData = true && (isSetUserData());
        list.add(present_userData);
        if (present_userData)
            list.add(userData);
        boolean present_sessionId = true && (isSetSessionId());
        list.add(present_sessionId);
        if (present_sessionId)
            list.add(sessionId);
        boolean present_serverIds = true && (isSetServerIds());
        list.add(present_serverIds);
        if (present_serverIds)
            list.add(serverIds);
        return list.hashCode();
    }

    @Override
    public int compareTo(DIdentityResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int lastComparison = 0;
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
        lastComparison = Boolean.valueOf(isSetUserData()).compareTo(other.isSetUserData());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUserData()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userData, other.userData);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSessionId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetServerIds()).compareTo(other.isSetServerIds());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetServerIds()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverIds, other.serverIds);
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
        StringBuilder sb = new StringBuilder("DIdentityResult(");
        boolean first = true;
        sb.append("userId:");
        sb.append(this.userId);
        first = false;
        if (isSetUserData()) {
            if (!first)
                sb.append(", ");
            sb.append("userData:");
            if (this.userData == null) {
                sb.append("null");
            } else {
                sb.append(this.userData);
            }
            first = false;
        }
        if (isSetSessionId()) {
            if (!first)
                sb.append(", ");
            sb.append("sessionId:");
            if (this.sessionId == null) {
                sb.append("null");
            } else {
                sb.append(this.sessionId);
            }
            first = false;
        }
        if (isSetServerIds()) {
            if (!first)
                sb.append(", ");
            sb.append("serverIds:");
            if (this.serverIds == null) {
                sb.append("null");
            } else {
                sb.append(this.serverIds);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
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

    private static class DIdentityResultStandardSchemeFactory implements SchemeFactory {

        public DIdentityResultStandardScheme getScheme() {
            return new DIdentityResultStandardScheme();
        }
    }

    private static class DIdentityResultStandardScheme extends StandardScheme<DIdentityResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, DIdentityResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch(schemeField.id) {
                    case // USER_ID
                    1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.userId = iprot.readI64();
                            struct.setUserIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // USER_DATA
                    2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.userData = iprot.readString();
                            struct.setUserDataIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // SESSION_ID
                    3:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.sessionId = iprot.readString();
                            struct.setSessionIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // SERVER_IDS
                    4:
                        if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                            {
                                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                                struct.serverIds = new ArrayList<Long>(_list0.size);
                                long _elem1;
                                for (int _i2 = 0; _i2 < _list0.size; ++_i2) {
                                    _elem1 = iprot.readI64();
                                    struct.serverIds.add(_elem1);
                                }
                                iprot.readListEnd();
                            }
                            struct.setServerIdsIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, DIdentityResult struct) throws org.apache.thrift.TException {
            struct.validate();
            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(USER_ID_FIELD_DESC);
            oprot.writeI64(struct.userId);
            oprot.writeFieldEnd();
            if (struct.userData != null) {
                if (struct.isSetUserData()) {
                    oprot.writeFieldBegin(USER_DATA_FIELD_DESC);
                    oprot.writeString(struct.userData);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.sessionId != null) {
                if (struct.isSetSessionId()) {
                    oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
                    oprot.writeString(struct.sessionId);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.serverIds != null) {
                if (struct.isSetServerIds()) {
                    oprot.writeFieldBegin(SERVER_IDS_FIELD_DESC);
                    {
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.serverIds.size()));
                        for (long _iter3 : struct.serverIds) {
                            oprot.writeI64(_iter3);
                        }
                        oprot.writeListEnd();
                    }
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    private static class DIdentityResultTupleSchemeFactory implements SchemeFactory {

        public DIdentityResultTupleScheme getScheme() {
            return new DIdentityResultTupleScheme();
        }
    }

    private static class DIdentityResultTupleScheme extends TupleScheme<DIdentityResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, DIdentityResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetUserId()) {
                optionals.set(0);
            }
            if (struct.isSetUserData()) {
                optionals.set(1);
            }
            if (struct.isSetSessionId()) {
                optionals.set(2);
            }
            if (struct.isSetServerIds()) {
                optionals.set(3);
            }
            oprot.writeBitSet(optionals, 4);
            if (struct.isSetUserId()) {
                oprot.writeI64(struct.userId);
            }
            if (struct.isSetUserData()) {
                oprot.writeString(struct.userData);
            }
            if (struct.isSetSessionId()) {
                oprot.writeString(struct.sessionId);
            }
            if (struct.isSetServerIds()) {
                {
                    oprot.writeI32(struct.serverIds.size());
                    for (long _iter4 : struct.serverIds) {
                        oprot.writeI64(_iter4);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, DIdentityResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(4);
            if (incoming.get(0)) {
                struct.userId = iprot.readI64();
                struct.setUserIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.userData = iprot.readString();
                struct.setUserDataIsSet(true);
            }
            if (incoming.get(2)) {
                struct.sessionId = iprot.readString();
                struct.setSessionIdIsSet(true);
            }
            if (incoming.get(3)) {
                {
                    org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
                    struct.serverIds = new ArrayList<Long>(_list5.size);
                    long _elem6;
                    for (int _i7 = 0; _i7 < _list5.size; ++_i7) {
                        _elem6 = iprot.readI64();
                        struct.serverIds.add(_elem6);
                    }
                }
                struct.setServerIdsIsSet(true);
            }
        }
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.USER_DATA, new org.apache.thrift.meta_data.FieldMetaData("userData", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.SERVER_IDS, new org.apache.thrift.meta_data.FieldMetaData("serverIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DIdentityResult.class, metaDataMap);
    }

    public DIdentityResult create() {
        return new DIdentityResult();
    }

    public DIdentityResult clone() {
        return cloneDepth(0);
    }

    public DIdentityResult cloneDepth(int _depth) {
        DIdentityResult _clone = create();
        _clone.setUserId(userId);
        _clone.setUserData(userData);
        _clone.setSessionId(sessionId);
        _clone.setServerIds(serverIds);
        cloneMore(_clone, _depth);
        return _clone;
    }

    public void cloneMore(DIdentityResult _clone, int _depth) {
    }
}
