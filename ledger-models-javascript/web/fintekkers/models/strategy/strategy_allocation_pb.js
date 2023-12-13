// source: fintekkers/models/strategy/strategy_allocation.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.exportSymbol('proto.fintekkers.models.strategy.MapFieldEntry', null, global);
goog.exportSymbol('proto.fintekkers.models.strategy.StrategyAllocationProto', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.fintekkers.models.strategy.MapFieldEntry = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.fintekkers.models.strategy.MapFieldEntry, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.models.strategy.MapFieldEntry.displayName = 'proto.fintekkers.models.strategy.MapFieldEntry';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.fintekkers.models.strategy.StrategyAllocationProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.fintekkers.models.strategy.StrategyAllocationProto.repeatedFields_, null);
};
goog.inherits(proto.fintekkers.models.strategy.StrategyAllocationProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.models.strategy.StrategyAllocationProto.displayName = 'proto.fintekkers.models.strategy.StrategyAllocationProto';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.models.strategy.MapFieldEntry.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.models.strategy.MapFieldEntry} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.strategy.MapFieldEntry.toObject = function(includeInstance, msg) {
  var f, obj = {
    key: (f = msg.getKey()) && proto.fintekkers.models.strategy.StrategyProto.toObject(includeInstance, f),
    value: (f = msg.getValue()) && proto.fintekkers.models.util.DecimalValueProto.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry}
 */
proto.fintekkers.models.strategy.MapFieldEntry.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.models.strategy.MapFieldEntry;
  return proto.fintekkers.models.strategy.MapFieldEntry.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.models.strategy.MapFieldEntry} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry}
 */
proto.fintekkers.models.strategy.MapFieldEntry.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.fintekkers.models.strategy.StrategyProto;
      reader.readMessage(value,proto.fintekkers.models.strategy.StrategyProto.deserializeBinaryFromReader);
      msg.setKey(value);
      break;
    case 2:
      var value = new proto.fintekkers.models.util.DecimalValueProto;
      reader.readMessage(value,proto.fintekkers.models.util.DecimalValueProto.deserializeBinaryFromReader);
      msg.setValue(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.models.strategy.MapFieldEntry.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.models.strategy.MapFieldEntry} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.strategy.MapFieldEntry.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKey();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.fintekkers.models.strategy.StrategyProto.serializeBinaryToWriter
    );
  }
  f = message.getValue();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.fintekkers.models.util.DecimalValueProto.serializeBinaryToWriter
    );
  }
};


/**
 * optional StrategyProto key = 1;
 * @return {?proto.fintekkers.models.strategy.StrategyProto}
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.getKey = function() {
  return /** @type{?proto.fintekkers.models.strategy.StrategyProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.strategy.StrategyProto, 1));
};


/**
 * @param {?proto.fintekkers.models.strategy.StrategyProto|undefined} value
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry} returns this
*/
proto.fintekkers.models.strategy.MapFieldEntry.prototype.setKey = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry} returns this
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.clearKey = function() {
  return this.setKey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.hasKey = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional fintekkers.models.util.DecimalValueProto value = 2;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.getValue = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.DecimalValueProto, 2));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry} returns this
*/
proto.fintekkers.models.strategy.MapFieldEntry.prototype.setValue = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry} returns this
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.clearValue = function() {
  return this.setValue(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.strategy.MapFieldEntry.prototype.hasValue = function() {
  return jspb.Message.getField(this, 2) != null;
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.repeatedFields_ = [10];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.models.strategy.StrategyAllocationProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.models.strategy.StrategyAllocationProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    objectClass: jspb.Message.getFieldWithDefault(msg, 1, ""),
    version: jspb.Message.getFieldWithDefault(msg, 2, ""),
    uuid: (f = msg.getUuid()) && proto.fintekkers.models.util.UUIDProto.toObject(includeInstance, f),
    asOf: (f = msg.getAsOf()) && proto.fintekkers.models.util.LocalTimestampProto.toObject(includeInstance, f),
    isLink: jspb.Message.getBooleanFieldWithDefault(msg, 7, false),
    allocationsList: jspb.Message.toObjectList(msg.getAllocationsList(),
    proto.fintekkers.models.strategy.MapFieldEntry.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.models.strategy.StrategyAllocationProto;
  return proto.fintekkers.models.strategy.StrategyAllocationProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.models.strategy.StrategyAllocationProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setObjectClass(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVersion(value);
      break;
    case 5:
      var value = new proto.fintekkers.models.util.UUIDProto;
      reader.readMessage(value,proto.fintekkers.models.util.UUIDProto.deserializeBinaryFromReader);
      msg.setUuid(value);
      break;
    case 6:
      var value = new proto.fintekkers.models.util.LocalTimestampProto;
      reader.readMessage(value,proto.fintekkers.models.util.LocalTimestampProto.deserializeBinaryFromReader);
      msg.setAsOf(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsLink(value);
      break;
    case 10:
      var value = new proto.fintekkers.models.strategy.MapFieldEntry;
      reader.readMessage(value,proto.fintekkers.models.strategy.MapFieldEntry.deserializeBinaryFromReader);
      msg.addAllocations(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.models.strategy.StrategyAllocationProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.models.strategy.StrategyAllocationProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getObjectClass();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getVersion();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUuid();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.fintekkers.models.util.UUIDProto.serializeBinaryToWriter
    );
  }
  f = message.getAsOf();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.fintekkers.models.util.LocalTimestampProto.serializeBinaryToWriter
    );
  }
  f = message.getIsLink();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
  f = message.getAllocationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.fintekkers.models.strategy.MapFieldEntry.serializeBinaryToWriter
    );
  }
};


/**
 * optional string object_class = 1;
 * @return {string}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.getObjectClass = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.setObjectClass = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string version = 2;
 * @return {string}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional fintekkers.models.util.UUIDProto uuid = 5;
 * @return {?proto.fintekkers.models.util.UUIDProto}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.getUuid = function() {
  return /** @type{?proto.fintekkers.models.util.UUIDProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.UUIDProto, 5));
};


/**
 * @param {?proto.fintekkers.models.util.UUIDProto|undefined} value
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
*/
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.setUuid = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.clearUuid = function() {
  return this.setUuid(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.hasUuid = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional fintekkers.models.util.LocalTimestampProto as_of = 6;
 * @return {?proto.fintekkers.models.util.LocalTimestampProto}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.getAsOf = function() {
  return /** @type{?proto.fintekkers.models.util.LocalTimestampProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.LocalTimestampProto, 6));
};


/**
 * @param {?proto.fintekkers.models.util.LocalTimestampProto|undefined} value
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
*/
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.setAsOf = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.clearAsOf = function() {
  return this.setAsOf(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.hasAsOf = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional bool is_link = 7;
 * @return {boolean}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.getIsLink = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.setIsLink = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


/**
 * repeated MapFieldEntry allocations = 10;
 * @return {!Array<!proto.fintekkers.models.strategy.MapFieldEntry>}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.getAllocationsList = function() {
  return /** @type{!Array<!proto.fintekkers.models.strategy.MapFieldEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.fintekkers.models.strategy.MapFieldEntry, 10));
};


/**
 * @param {!Array<!proto.fintekkers.models.strategy.MapFieldEntry>} value
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
*/
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.setAllocationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.fintekkers.models.strategy.MapFieldEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.models.strategy.MapFieldEntry}
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.addAllocations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.fintekkers.models.strategy.MapFieldEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.models.strategy.StrategyAllocationProto} returns this
 */
proto.fintekkers.models.strategy.StrategyAllocationProto.prototype.clearAllocationsList = function() {
  return this.setAllocationsList([]);
};


