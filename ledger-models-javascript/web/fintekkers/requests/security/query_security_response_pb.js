// source: fintekkers/requests/security/query_security_response.proto
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

goog.exportSymbol('proto.fintekkers.requests.security.QuerySecurityResponseProto', null, global);
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
proto.fintekkers.requests.security.QuerySecurityResponseProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.fintekkers.requests.security.QuerySecurityResponseProto.repeatedFields_, null);
};
goog.inherits(proto.fintekkers.requests.security.QuerySecurityResponseProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.requests.security.QuerySecurityResponseProto.displayName = 'proto.fintekkers.requests.security.QuerySecurityResponseProto';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.repeatedFields_ = [30,40];



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
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.requests.security.QuerySecurityResponseProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.requests.security.QuerySecurityResponseProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    objectClass: jspb.Message.getFieldWithDefault(msg, 1, ""),
    version: jspb.Message.getFieldWithDefault(msg, 2, ""),
    querySecurityInput: (f = msg.getQuerySecurityInput()) && proto.fintekkers.requests.security.QuerySecurityRequestProto.toObject(includeInstance, f),
    securityResponseList: jspb.Message.toObjectList(msg.getSecurityResponseList(),
    proto.fintekkers.models.security.SecurityProto.toObject, includeInstance),
    errorsOrWarningsList: jspb.Message.toObjectList(msg.getErrorsOrWarningsList(),
    proto.fintekkers.requests.util.errors.SummaryProto.toObject, includeInstance)
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
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.requests.security.QuerySecurityResponseProto;
  return proto.fintekkers.requests.security.QuerySecurityResponseProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.requests.security.QuerySecurityResponseProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.fintekkers.requests.security.QuerySecurityRequestProto;
      reader.readMessage(value,proto.fintekkers.requests.security.QuerySecurityRequestProto.deserializeBinaryFromReader);
      msg.setQuerySecurityInput(value);
      break;
    case 30:
      var value = new proto.fintekkers.models.security.SecurityProto;
      reader.readMessage(value,proto.fintekkers.models.security.SecurityProto.deserializeBinaryFromReader);
      msg.addSecurityResponse(value);
      break;
    case 40:
      var value = new proto.fintekkers.requests.util.errors.SummaryProto;
      reader.readMessage(value,proto.fintekkers.requests.util.errors.SummaryProto.deserializeBinaryFromReader);
      msg.addErrorsOrWarnings(value);
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
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.requests.security.QuerySecurityResponseProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.requests.security.QuerySecurityResponseProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getQuerySecurityInput();
  if (f != null) {
    writer.writeMessage(
      20,
      f,
      proto.fintekkers.requests.security.QuerySecurityRequestProto.serializeBinaryToWriter
    );
  }
  f = message.getSecurityResponseList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      30,
      f,
      proto.fintekkers.models.security.SecurityProto.serializeBinaryToWriter
    );
  }
  f = message.getErrorsOrWarningsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      40,
      f,
      proto.fintekkers.requests.util.errors.SummaryProto.serializeBinaryToWriter
    );
  }
};


/**
 * optional string object_class = 1;
 * @return {string}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.getObjectClass = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.setObjectClass = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string version = 2;
 * @return {string}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional QuerySecurityRequestProto query_security_input = 20;
 * @return {?proto.fintekkers.requests.security.QuerySecurityRequestProto}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.getQuerySecurityInput = function() {
  return /** @type{?proto.fintekkers.requests.security.QuerySecurityRequestProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.requests.security.QuerySecurityRequestProto, 20));
};


/**
 * @param {?proto.fintekkers.requests.security.QuerySecurityRequestProto|undefined} value
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
*/
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.setQuerySecurityInput = function(value) {
  return jspb.Message.setWrapperField(this, 20, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.clearQuerySecurityInput = function() {
  return this.setQuerySecurityInput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.hasQuerySecurityInput = function() {
  return jspb.Message.getField(this, 20) != null;
};


/**
 * repeated fintekkers.models.security.SecurityProto security_response = 30;
 * @return {!Array<!proto.fintekkers.models.security.SecurityProto>}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.getSecurityResponseList = function() {
  return /** @type{!Array<!proto.fintekkers.models.security.SecurityProto>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.fintekkers.models.security.SecurityProto, 30));
};


/**
 * @param {!Array<!proto.fintekkers.models.security.SecurityProto>} value
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
*/
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.setSecurityResponseList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 30, value);
};


/**
 * @param {!proto.fintekkers.models.security.SecurityProto=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.models.security.SecurityProto}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.addSecurityResponse = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 30, opt_value, proto.fintekkers.models.security.SecurityProto, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.clearSecurityResponseList = function() {
  return this.setSecurityResponseList([]);
};


/**
 * repeated fintekkers.requests.util.errors.SummaryProto errors_or_warnings = 40;
 * @return {!Array<!proto.fintekkers.requests.util.errors.SummaryProto>}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.getErrorsOrWarningsList = function() {
  return /** @type{!Array<!proto.fintekkers.requests.util.errors.SummaryProto>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.fintekkers.requests.util.errors.SummaryProto, 40));
};


/**
 * @param {!Array<!proto.fintekkers.requests.util.errors.SummaryProto>} value
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
*/
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.setErrorsOrWarningsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 40, value);
};


/**
 * @param {!proto.fintekkers.requests.util.errors.SummaryProto=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.requests.util.errors.SummaryProto}
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.addErrorsOrWarnings = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 40, opt_value, proto.fintekkers.requests.util.errors.SummaryProto, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.requests.security.QuerySecurityResponseProto} returns this
 */
proto.fintekkers.requests.security.QuerySecurityResponseProto.prototype.clearErrorsOrWarningsList = function() {
  return this.setErrorsOrWarningsList([]);
};


