"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ProtoSerializationUtil = void 0;
var identifier_pb_1 = require("../../../fintekkers/models/security/identifier/identifier_pb");
var decimal_value_pb_1 = require("../../../fintekkers/models/util/decimal_value_pb");
var local_date_pb_1 = require("../../../fintekkers/models/util/local_date_pb");
var local_timestamp_pb_1 = require("../../../fintekkers/models/util/local_timestamp_pb");
var uuid_pb_1 = require("../../../fintekkers/models/util/uuid_pb");
var datetime_1 = require("./datetime");
var protoEnum_1 = require("./protoEnum");
var uuid_1 = require("./uuid");
var wrappers_pb_1 = require("google-protobuf/google/protobuf/wrappers_pb");
var ProtoSerializationUtil = /** @class */ (function () {
    function ProtoSerializationUtil() {
    }
    ProtoSerializationUtil.serialize = function (obj) {
        if (obj instanceof uuid_1.UUID) {
            return obj.toUUIDProto();
        }
        if (obj instanceof Date) {
            return new local_date_pb_1.LocalDateProto()
                .setYear(obj.getFullYear())
                .setMonth(obj.getMonth() + 1)
                .setDay(obj.getDate());
        }
        if (obj instanceof datetime_1.ZonedDateTime) {
            return obj.toProto();
        }
        if (typeof obj === "number") {
            return new decimal_value_pb_1.DecimalValueProto().setArbitraryPrecisionValue(obj.toString());
        }
        if (obj instanceof String) {
            return wrappers_pb_1.StringValue.of(obj);
        }
        throw new Error("Could not serialize object of type ".concat(typeof obj, ". Value: ").concat(obj));
    };
    ProtoSerializationUtil.deserialize = function (obj) {
        if (obj instanceof uuid_pb_1.UUIDProto) {
            return uuid_1.UUID.fromU8Array(obj.getRawUuid_asU8());
        }
        if (obj instanceof local_date_pb_1.LocalDateProto) {
            var date = new Date(obj.getYear(), obj.getMonth() - 1, obj.getDay());
            date.setHours(0, 0, 0, 0);
            return date;
        }
        if (obj instanceof local_timestamp_pb_1.LocalTimestampProto) {
            return new datetime_1.ZonedDateTime(obj);
        }
        if (obj instanceof identifier_pb_1.IdentifierProto) {
            return obj.getIdentifierType() + ":" + obj.getIdentifierValue();
        }
        if (obj instanceof decimal_value_pb_1.DecimalValueProto) {
            return parseFloat(obj.getArbitraryPrecisionValue());
        }
        if (obj instanceof wrappers_pb_1.StringValue) {
            return obj.toString();
        }
        if (obj !== null && 'enum_name' in obj && typeof obj.enum_name !== 'undefined' && obj.enum_name !== null) {
            return new protoEnum_1.ProtoEnum(obj.descriptor, obj.enum_value);
        }
        throw new Error("Could not deserialize object of type ".concat(typeof obj, ". Value: ").concat(obj));
    };
    return ProtoSerializationUtil;
}());
exports.ProtoSerializationUtil = ProtoSerializationUtil;
//# sourceMappingURL=serialization.js.map