// source: fintekkers/models/security/bond/issuance.proto
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

goog.exportSymbol('proto.fintekkers.models.security.bond.IssuanceProto', null, global);
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
proto.fintekkers.models.security.bond.IssuanceProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.fintekkers.models.security.bond.IssuanceProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.models.security.bond.IssuanceProto.displayName = 'proto.fintekkers.models.security.bond.IssuanceProto';
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
proto.fintekkers.models.security.bond.IssuanceProto.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.models.security.bond.IssuanceProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.models.security.bond.IssuanceProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.security.bond.IssuanceProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    objectClass: jspb.Message.getFieldWithDefault(msg, 1, ""),
    version: jspb.Message.getFieldWithDefault(msg, 2, ""),
    asOf: (f = msg.getAsOf()) && proto.fintekkers.models.util.LocalTimestampProto.toObject(includeInstance, f),
    validFrom: (f = msg.getValidFrom()) && proto.fintekkers.models.util.LocalTimestampProto.toObject(includeInstance, f),
    validTo: (f = msg.getValidTo()) && proto.fintekkers.models.util.LocalTimestampProto.toObject(includeInstance, f),
    auctionAnnouncementDate: (f = msg.getAuctionAnnouncementDate()) && proto.fintekkers.models.util.LocalDateProto.toObject(includeInstance, f),
    auctionIssueDate: (f = msg.getAuctionIssueDate()) && proto.fintekkers.models.util.LocalDateProto.toObject(includeInstance, f),
    postAuctionOutstandingQuantity: (f = msg.getPostAuctionOutstandingQuantity()) && proto.fintekkers.models.util.DecimalValueProto.toObject(includeInstance, f),
    auctionOfferingAmount: (f = msg.getAuctionOfferingAmount()) && proto.fintekkers.models.util.DecimalValueProto.toObject(includeInstance, f),
    auctionType: jspb.Message.getFieldWithDefault(msg, 24, 0),
    priceForSinglePriceAuction: (f = msg.getPriceForSinglePriceAuction()) && proto.fintekkers.models.util.DecimalValueProto.toObject(includeInstance, f),
    totalAccepted: (f = msg.getTotalAccepted()) && proto.fintekkers.models.util.DecimalValueProto.toObject(includeInstance, f),
    matureSecurityAmount: (f = msg.getMatureSecurityAmount()) && proto.fintekkers.models.util.DecimalValueProto.toObject(includeInstance, f)
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
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.models.security.bond.IssuanceProto;
  return proto.fintekkers.models.security.bond.IssuanceProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.models.security.bond.IssuanceProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.deserializeBinaryFromReader = function(msg, reader) {
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
    case 6:
      var value = new proto.fintekkers.models.util.LocalTimestampProto;
      reader.readMessage(value,proto.fintekkers.models.util.LocalTimestampProto.deserializeBinaryFromReader);
      msg.setAsOf(value);
      break;
    case 8:
      var value = new proto.fintekkers.models.util.LocalTimestampProto;
      reader.readMessage(value,proto.fintekkers.models.util.LocalTimestampProto.deserializeBinaryFromReader);
      msg.setValidFrom(value);
      break;
    case 9:
      var value = new proto.fintekkers.models.util.LocalTimestampProto;
      reader.readMessage(value,proto.fintekkers.models.util.LocalTimestampProto.deserializeBinaryFromReader);
      msg.setValidTo(value);
      break;
    case 20:
      var value = new proto.fintekkers.models.util.LocalDateProto;
      reader.readMessage(value,proto.fintekkers.models.util.LocalDateProto.deserializeBinaryFromReader);
      msg.setAuctionAnnouncementDate(value);
      break;
    case 21:
      var value = new proto.fintekkers.models.util.LocalDateProto;
      reader.readMessage(value,proto.fintekkers.models.util.LocalDateProto.deserializeBinaryFromReader);
      msg.setAuctionIssueDate(value);
      break;
    case 22:
      var value = new proto.fintekkers.models.util.DecimalValueProto;
      reader.readMessage(value,proto.fintekkers.models.util.DecimalValueProto.deserializeBinaryFromReader);
      msg.setPostAuctionOutstandingQuantity(value);
      break;
    case 23:
      var value = new proto.fintekkers.models.util.DecimalValueProto;
      reader.readMessage(value,proto.fintekkers.models.util.DecimalValueProto.deserializeBinaryFromReader);
      msg.setAuctionOfferingAmount(value);
      break;
    case 24:
      var value = /** @type {!proto.fintekkers.models.security.bond.AuctionTypeProto} */ (reader.readEnum());
      msg.setAuctionType(value);
      break;
    case 25:
      var value = new proto.fintekkers.models.util.DecimalValueProto;
      reader.readMessage(value,proto.fintekkers.models.util.DecimalValueProto.deserializeBinaryFromReader);
      msg.setPriceForSinglePriceAuction(value);
      break;
    case 26:
      var value = new proto.fintekkers.models.util.DecimalValueProto;
      reader.readMessage(value,proto.fintekkers.models.util.DecimalValueProto.deserializeBinaryFromReader);
      msg.setTotalAccepted(value);
      break;
    case 27:
      var value = new proto.fintekkers.models.util.DecimalValueProto;
      reader.readMessage(value,proto.fintekkers.models.util.DecimalValueProto.deserializeBinaryFromReader);
      msg.setMatureSecurityAmount(value);
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
proto.fintekkers.models.security.bond.IssuanceProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.models.security.bond.IssuanceProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.models.security.bond.IssuanceProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.security.bond.IssuanceProto.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getAsOf();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.fintekkers.models.util.LocalTimestampProto.serializeBinaryToWriter
    );
  }
  f = message.getValidFrom();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.fintekkers.models.util.LocalTimestampProto.serializeBinaryToWriter
    );
  }
  f = message.getValidTo();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.fintekkers.models.util.LocalTimestampProto.serializeBinaryToWriter
    );
  }
  f = message.getAuctionAnnouncementDate();
  if (f != null) {
    writer.writeMessage(
      20,
      f,
      proto.fintekkers.models.util.LocalDateProto.serializeBinaryToWriter
    );
  }
  f = message.getAuctionIssueDate();
  if (f != null) {
    writer.writeMessage(
      21,
      f,
      proto.fintekkers.models.util.LocalDateProto.serializeBinaryToWriter
    );
  }
  f = message.getPostAuctionOutstandingQuantity();
  if (f != null) {
    writer.writeMessage(
      22,
      f,
      proto.fintekkers.models.util.DecimalValueProto.serializeBinaryToWriter
    );
  }
  f = message.getAuctionOfferingAmount();
  if (f != null) {
    writer.writeMessage(
      23,
      f,
      proto.fintekkers.models.util.DecimalValueProto.serializeBinaryToWriter
    );
  }
  f = message.getAuctionType();
  if (f !== 0.0) {
    writer.writeEnum(
      24,
      f
    );
  }
  f = message.getPriceForSinglePriceAuction();
  if (f != null) {
    writer.writeMessage(
      25,
      f,
      proto.fintekkers.models.util.DecimalValueProto.serializeBinaryToWriter
    );
  }
  f = message.getTotalAccepted();
  if (f != null) {
    writer.writeMessage(
      26,
      f,
      proto.fintekkers.models.util.DecimalValueProto.serializeBinaryToWriter
    );
  }
  f = message.getMatureSecurityAmount();
  if (f != null) {
    writer.writeMessage(
      27,
      f,
      proto.fintekkers.models.util.DecimalValueProto.serializeBinaryToWriter
    );
  }
};


/**
 * optional string object_class = 1;
 * @return {string}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getObjectClass = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setObjectClass = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string version = 2;
 * @return {string}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional fintekkers.models.util.LocalTimestampProto as_of = 6;
 * @return {?proto.fintekkers.models.util.LocalTimestampProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getAsOf = function() {
  return /** @type{?proto.fintekkers.models.util.LocalTimestampProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.LocalTimestampProto, 6));
};


/**
 * @param {?proto.fintekkers.models.util.LocalTimestampProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setAsOf = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearAsOf = function() {
  return this.setAsOf(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasAsOf = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional fintekkers.models.util.LocalTimestampProto valid_from = 8;
 * @return {?proto.fintekkers.models.util.LocalTimestampProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getValidFrom = function() {
  return /** @type{?proto.fintekkers.models.util.LocalTimestampProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.LocalTimestampProto, 8));
};


/**
 * @param {?proto.fintekkers.models.util.LocalTimestampProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setValidFrom = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearValidFrom = function() {
  return this.setValidFrom(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasValidFrom = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional fintekkers.models.util.LocalTimestampProto valid_to = 9;
 * @return {?proto.fintekkers.models.util.LocalTimestampProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getValidTo = function() {
  return /** @type{?proto.fintekkers.models.util.LocalTimestampProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.LocalTimestampProto, 9));
};


/**
 * @param {?proto.fintekkers.models.util.LocalTimestampProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setValidTo = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearValidTo = function() {
  return this.setValidTo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasValidTo = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional fintekkers.models.util.LocalDateProto auction_announcement_date = 20;
 * @return {?proto.fintekkers.models.util.LocalDateProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getAuctionAnnouncementDate = function() {
  return /** @type{?proto.fintekkers.models.util.LocalDateProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.LocalDateProto, 20));
};


/**
 * @param {?proto.fintekkers.models.util.LocalDateProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setAuctionAnnouncementDate = function(value) {
  return jspb.Message.setWrapperField(this, 20, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearAuctionAnnouncementDate = function() {
  return this.setAuctionAnnouncementDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasAuctionAnnouncementDate = function() {
  return jspb.Message.getField(this, 20) != null;
};


/**
 * optional fintekkers.models.util.LocalDateProto auction_issue_date = 21;
 * @return {?proto.fintekkers.models.util.LocalDateProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getAuctionIssueDate = function() {
  return /** @type{?proto.fintekkers.models.util.LocalDateProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.LocalDateProto, 21));
};


/**
 * @param {?proto.fintekkers.models.util.LocalDateProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setAuctionIssueDate = function(value) {
  return jspb.Message.setWrapperField(this, 21, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearAuctionIssueDate = function() {
  return this.setAuctionIssueDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasAuctionIssueDate = function() {
  return jspb.Message.getField(this, 21) != null;
};


/**
 * optional fintekkers.models.util.DecimalValueProto post_auction_outstanding_quantity = 22;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getPostAuctionOutstandingQuantity = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.DecimalValueProto, 22));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setPostAuctionOutstandingQuantity = function(value) {
  return jspb.Message.setWrapperField(this, 22, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearPostAuctionOutstandingQuantity = function() {
  return this.setPostAuctionOutstandingQuantity(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasPostAuctionOutstandingQuantity = function() {
  return jspb.Message.getField(this, 22) != null;
};


/**
 * optional fintekkers.models.util.DecimalValueProto auction_offering_amount = 23;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getAuctionOfferingAmount = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.DecimalValueProto, 23));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setAuctionOfferingAmount = function(value) {
  return jspb.Message.setWrapperField(this, 23, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearAuctionOfferingAmount = function() {
  return this.setAuctionOfferingAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasAuctionOfferingAmount = function() {
  return jspb.Message.getField(this, 23) != null;
};


/**
 * optional AuctionTypeProto auction_type = 24;
 * @return {!proto.fintekkers.models.security.bond.AuctionTypeProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getAuctionType = function() {
  return /** @type {!proto.fintekkers.models.security.bond.AuctionTypeProto} */ (jspb.Message.getFieldWithDefault(this, 24, 0));
};


/**
 * @param {!proto.fintekkers.models.security.bond.AuctionTypeProto} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setAuctionType = function(value) {
  return jspb.Message.setProto3EnumField(this, 24, value);
};


/**
 * optional fintekkers.models.util.DecimalValueProto price_for_single_price_auction = 25;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getPriceForSinglePriceAuction = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.DecimalValueProto, 25));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setPriceForSinglePriceAuction = function(value) {
  return jspb.Message.setWrapperField(this, 25, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearPriceForSinglePriceAuction = function() {
  return this.setPriceForSinglePriceAuction(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasPriceForSinglePriceAuction = function() {
  return jspb.Message.getField(this, 25) != null;
};


/**
 * optional fintekkers.models.util.DecimalValueProto total_accepted = 26;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getTotalAccepted = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.DecimalValueProto, 26));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setTotalAccepted = function(value) {
  return jspb.Message.setWrapperField(this, 26, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearTotalAccepted = function() {
  return this.setTotalAccepted(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasTotalAccepted = function() {
  return jspb.Message.getField(this, 26) != null;
};


/**
 * optional fintekkers.models.util.DecimalValueProto mature_security_amount = 27;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.getMatureSecurityAmount = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, proto.fintekkers.models.util.DecimalValueProto, 27));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
*/
proto.fintekkers.models.security.bond.IssuanceProto.prototype.setMatureSecurityAmount = function(value) {
  return jspb.Message.setWrapperField(this, 27, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.security.bond.IssuanceProto} returns this
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.clearMatureSecurityAmount = function() {
  return this.setMatureSecurityAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.security.bond.IssuanceProto.prototype.hasMatureSecurityAmount = function() {
  return jspb.Message.getField(this, 27) != null;
};


