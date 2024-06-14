"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ProtoEnum = void 0;
var transaction_type_pb_1 = require("../../../fintekkers/models/transaction/transaction_type_pb");
var position_status_pb_1 = require("../../../fintekkers/models/position/position_status_pb");
var field_pb_1 = require("../../../fintekkers/models/position/field_pb");
var ProtoEnum = /** @class */ (function () {
    function ProtoEnum(enumDescriptor, enumValue) {
        this.enumValue = enumValue;
        this.enumDescriptor = enumDescriptor;
    }
    ProtoEnum.fromEnumName = function (enumName, enumValue) {
        return new ProtoEnum(ProtoEnum.getFieldDescriptorFromName(enumName), enumValue);
    };
    ProtoEnum.getFieldDescriptorFromName = function (enumName) {
        if (enumName === "TRANSACTION_TYPE") {
            return transaction_type_pb_1.TransactionTypeProto;
        }
        if (enumName === "POSITION_STATUS") {
            return position_status_pb_1.PositionStatusProto;
        }
        if (enumName === "FIELD") {
            return field_pb_1.FieldProto;
        }
        throw new Error("Enum has not been mapped: ".concat(enumName));
    };
    ProtoEnum.prototype.getEnumDescriptor = function () {
        return this.enumDescriptor;
    };
    ProtoEnum.prototype.getEnumName = function () {
        // Assuming your enumDescriptor has a name property or similar
        throw new Error("Not supported currently");
        //  return this.enumDescriptor.name;
    };
    ProtoEnum.prototype.getEnumValue = function () {
        return this.enumValue;
    };
    ProtoEnum.prototype.getEnumValueName = function () {
        var _this = this;
        // In TypeScript/JS, enum values can be accessed directly if you know the value
        // Assuming your enums are simple objects or as generated by protobuf ts
        var enumKey = Object.keys(this.enumDescriptor).find(function (key) { return _this.enumDescriptor[key] === _this.enumValue; });
        if (!enumKey) {
            return 'UNKNOWN'; // Or handle as appropriate
        }
        return enumKey;
    };
    ProtoEnum.prototype.toString = function () {
        return this.getEnumValueName();
    };
    return ProtoEnum;
}());
exports.ProtoEnum = ProtoEnum;
//# sourceMappingURL=protoEnum.js.map