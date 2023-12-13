// source: fintekkers/requests/price/query_price_response.proto
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

goog.exportSymbol('proto.fintekkers.requests.price.QueryPriceResponseProto', null, global);
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
proto.fintekkers.requests.price.QueryPriceResponseProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.fintekkers.requests.price.QueryPriceResponseProto.repeatedFields_, null);
};
goog.inherits(proto.fintekkers.requests.price.QueryPriceResponseProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.requests.price.QueryPriceResponseProto.displayName = 'proto.fintekkers.requests.price.QueryPriceResponseProto';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.repeatedFields_ = [30];



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
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.requests.price.QueryPriceResponseProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.requests.price.QueryPriceResponseProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    objectClass: jspb.Message.getFieldWithDefault(msg, 1, ""),
    version: jspb.Message.getFieldWithDefault(msg, 2, ""),
    queryPriceRequest: (f = msg.getQueryPriceRequest()) && proto.fintekkers.requests.price.QueryPriceRequestProto.toObject(includeInstance, f),
    priceResponseList: jspb.Message.toObjectList(msg.getPriceResponseList(),
    proto.fintekkers.models.price.PriceProto.toObject, includeInstance)
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
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.requests.price.QueryPriceResponseProto;
  return proto.fintekkers.requests.price.QueryPriceResponseProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.requests.price.QueryPriceResponseProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.deserializeBinaryFromReader = function(msg, reader) {
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
    case 20:
      var value = new proto.fintekkers.requests.price.QueryPriceRequestProto;
      reader.readMessage(value,proto.fintekkers.requests.price.QueryPriceRequestProto.deserializeBinaryFromReader);
      msg.setQueryPriceRequest(value);
      break;
    case 30:
      var value = new proto.fintekkers.models.price.PriceProto;
      reader.readMessage(value,proto.fintekkers.models.price.PriceProto.deserializeBinaryFromReader);
      msg.addPriceResponse(value);
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
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.requests.price.QueryPriceResponseProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.requests.price.QueryPriceResponseProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getQueryPriceRequest();
  if (f != null) {
    writer.writeMessage(
      20,
      f,
      proto.fintekkers.requests.price.QueryPriceRequestProto.serializeBinaryToWriter
    );
  }
  f = message.getPriceResponseList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      30,
      f,
      proto.fintekkers.models.price.PriceProto.serializeBinaryToWriter
    );
  }
};


/**
 * optional string object_class = 1;
 * @return {string}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.getObjectClass = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto} returns this
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.setObjectClass = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string version = 2;
 * @return {string}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto} returns this
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional QueryPriceRequestProto query_price_request = 20;
 * @return {?proto.fintekkers.requests.price.QueryPriceRequestProto}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.getQueryPriceRequest = function() {
  return /** @type{?proto.fintekkers.requests.price.QueryPriceRequestProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.requests.price.QueryPriceRequestProto, 20));
};


/**
 * @param {?proto.fintekkers.requests.price.QueryPriceRequestProto|undefined} value
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto} returns this
*/
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.setQueryPriceRequest = function(value) {
  return jspb.Message.setWrapperField(this, 20, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto} returns this
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.clearQueryPriceRequest = function() {
  return this.setQueryPriceRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.hasQueryPriceRequest = function() {
  return jspb.Message.getField(this, 20) != null;
};


/**
 * repeated fintekkers.models.price.PriceProto price_response = 30;
 * @return {!Array<!proto.fintekkers.models.price.PriceProto>}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.getPriceResponseList = function() {
  return /** @type{!Array<!proto.fintekkers.models.price.PriceProto>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.fintekkers.models.price.PriceProto, 30));
};


/**
 * @param {!Array<!proto.fintekkers.models.price.PriceProto>} value
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto} returns this
*/
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.setPriceResponseList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 30, value);
};


/**
 * @param {!proto.fintekkers.models.price.PriceProto=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.models.price.PriceProto}
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.addPriceResponse = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 30, opt_value, proto.fintekkers.models.price.PriceProto, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.requests.price.QueryPriceResponseProto} returns this
 */
proto.fintekkers.requests.price.QueryPriceResponseProto.prototype.clearPriceResponseList = function() {
  return this.setPriceResponseList([]);
};


