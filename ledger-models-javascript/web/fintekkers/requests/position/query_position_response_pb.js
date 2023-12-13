// source: fintekkers/requests/position/query_position_response.proto
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

goog.exportSymbol('proto.fintekkers.requests.position.QueryPositionResponseProto', null, global);
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
proto.fintekkers.requests.position.QueryPositionResponseProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.fintekkers.requests.position.QueryPositionResponseProto.repeatedFields_, null);
};
goog.inherits(proto.fintekkers.requests.position.QueryPositionResponseProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.requests.position.QueryPositionResponseProto.displayName = 'proto.fintekkers.requests.position.QueryPositionResponseProto';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.repeatedFields_ = [30];



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
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.requests.position.QueryPositionResponseProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.requests.position.QueryPositionResponseProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    objectClass: jspb.Message.getFieldWithDefault(msg, 1, ""),
    version: jspb.Message.getFieldWithDefault(msg, 2, ""),
    positionRequest: (f = msg.getPositionRequest()) && proto.fintekkers.requests.position.QueryPositionRequestProto.toObject(includeInstance, f),
    reportingCurrency: jspb.Message.getFieldWithDefault(msg, 12, ""),
    positionsList: jspb.Message.toObjectList(msg.getPositionsList(),
    proto.fintekkers.models.position.PositionProto.toObject, includeInstance)
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
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.requests.position.QueryPositionResponseProto;
  return proto.fintekkers.requests.position.QueryPositionResponseProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.requests.position.QueryPositionResponseProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.deserializeBinaryFromReader = function(msg, reader) {
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
    case 11:
      var value = new proto.fintekkers.requests.position.QueryPositionRequestProto;
      reader.readMessage(value,proto.fintekkers.requests.position.QueryPositionRequestProto.deserializeBinaryFromReader);
      msg.setPositionRequest(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setReportingCurrency(value);
      break;
    case 30:
      var value = new proto.fintekkers.models.position.PositionProto;
      reader.readMessage(value,proto.fintekkers.models.position.PositionProto.deserializeBinaryFromReader);
      msg.addPositions(value);
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
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.requests.position.QueryPositionResponseProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.requests.position.QueryPositionResponseProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getPositionRequest();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.fintekkers.requests.position.QueryPositionRequestProto.serializeBinaryToWriter
    );
  }
  f = message.getReportingCurrency();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getPositionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      30,
      f,
      proto.fintekkers.models.position.PositionProto.serializeBinaryToWriter
    );
  }
};


/**
 * optional string object_class = 1;
 * @return {string}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.getObjectClass = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.setObjectClass = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string version = 2;
 * @return {string}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional QueryPositionRequestProto position_request = 11;
 * @return {?proto.fintekkers.requests.position.QueryPositionRequestProto}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.getPositionRequest = function() {
  return /** @type{?proto.fintekkers.requests.position.QueryPositionRequestProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.requests.position.QueryPositionRequestProto, 11));
};


/**
 * @param {?proto.fintekkers.requests.position.QueryPositionRequestProto|undefined} value
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
*/
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.setPositionRequest = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.clearPositionRequest = function() {
  return this.setPositionRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.hasPositionRequest = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional string reporting_currency = 12;
 * @return {string}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.getReportingCurrency = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.setReportingCurrency = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * repeated fintekkers.models.position.PositionProto positions = 30;
 * @return {!Array<!proto.fintekkers.models.position.PositionProto>}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.getPositionsList = function() {
  return /** @type{!Array<!proto.fintekkers.models.position.PositionProto>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.fintekkers.models.position.PositionProto, 30));
};


/**
 * @param {!Array<!proto.fintekkers.models.position.PositionProto>} value
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
*/
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.setPositionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 30, value);
};


/**
 * @param {!proto.fintekkers.models.position.PositionProto=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.models.position.PositionProto}
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.addPositions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 30, opt_value, proto.fintekkers.models.position.PositionProto, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.requests.position.QueryPositionResponseProto} returns this
 */
proto.fintekkers.requests.position.QueryPositionResponseProto.prototype.clearPositionsList = function() {
  return this.setPositionsList([]);
};


