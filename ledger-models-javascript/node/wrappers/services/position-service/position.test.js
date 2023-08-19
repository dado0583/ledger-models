"use strict";
// Models
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (g && (g = 0, op[0] && (_ = 0)), _) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
var identifier_pb_1 = require("../../../fintekkers/models/security/identifier/identifier_pb");
var position_pb_1 = require("../../../fintekkers/models/position/position_pb");
var measure_pb_1 = require("../../../fintekkers/models/position/measure_pb");
// Model Utils
var field_pb_1 = require("../../../fintekkers/models/position/field_pb");
var position_util_pb_1 = require("../../../fintekkers/models/position/position_util_pb");
var position_filter_pb_1 = require("../../../fintekkers/models/position/position_filter_pb");
var datetime_1 = require("../../models/utils/datetime");
var serialization_util_1 = require("../../models/utils/serialization.util");
var any_pb_1 = require("google-protobuf/google/protobuf/any_pb");
//Requests & Services
var PortfolioService_1 = require("../../services/portfolio-service/PortfolioService");
var PositionService_1 = require("../../services/position-service/PositionService");
var query_position_request_pb_1 = require("../../../fintekkers/requests/position/query_position_request_pb");
test('test getting a position against the api.fintekkers.org position service', function () { return __awaiter(void 0, void 0, void 0, function () {
    var isTrue;
    return __generator(this, function (_a) {
        switch (_a.label) {
            case 0: return [4 /*yield*/, testPosition()];
            case 1:
                isTrue = _a.sent();
                expect(isTrue).toBe(true);
                return [2 /*return*/];
        }
    });
}); }, 30000);
function get_position(security, portfolio, measures, position_type, fields, additional_filters, as_of) {
    if (fields === void 0) { fields = [field_pb_1.FieldProto.PORTFOLIO, field_pb_1.FieldProto.SECURITY]; }
    if (additional_filters === void 0) { additional_filters = []; }
    if (as_of === void 0) { as_of = datetime_1.ZonedDateTime.now(); }
    return __awaiter(this, void 0, void 0, function () {
        var filters, id_proto, security_id_packed, fieldMapEntry, fieldMapEntry, filter_fields, as_of_proto, request, position_service, positions;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    filters = [];
                    if (security !== null && security !== undefined) {
                        id_proto = new identifier_pb_1.IdentifierProto();
                        id_proto.setIdentifierValue(security.getIdentifier().getIdentifierValue());
                        id_proto.setIdentifierType(security.getIdentifier().getIdentifierType());
                        security_id_packed = new any_pb_1.Any();
                        security_id_packed.pack(id_proto);
                        fieldMapEntry = new position_util_pb_1.FieldMapEntry();
                        fieldMapEntry.setField(field_pb_1.FieldProto.IDENTIFIER);
                        fieldMapEntry.setFieldValuePacked(security_id_packed);
                        filters.push(fieldMapEntry);
                    }
                    if (portfolio !== null && portfolio !== undefined) {
                        fieldMapEntry = new position_util_pb_1.FieldMapEntry();
                        fieldMapEntry.setField(field_pb_1.FieldProto.PORTFOLIO_NAME);
                        fieldMapEntry.setFieldValuePacked((0, serialization_util_1.pack)(portfolio.getPortfolioName()));
                        filters.push(fieldMapEntry);
                    }
                    if (additional_filters !== null && additional_filters.length > 0) {
                        filters.push.apply(filters, additional_filters);
                    }
                    filter_fields = new position_filter_pb_1.PositionFilterProto();
                    filter_fields.setFiltersList(filters);
                    as_of_proto = as_of.toProto();
                    request = new query_position_request_pb_1.QueryPositionRequestProto();
                    request.setPositionType(position_type);
                    request.setPositionView(position_pb_1.PositionViewProto.DEFAULT_VIEW);
                    request.setFieldsList(fields);
                    request.setMeasuresList(measures);
                    request.setFilterFields(filter_fields);
                    request.setAsOf(as_of_proto);
                    position_service = new PositionService_1.PositionService();
                    return [4 /*yield*/, position_service.search(request)];
                case 1:
                    positions = _a.sent();
                    return [2 /*return*/, positions];
            }
        });
    });
}
function testPosition() {
    return __awaiter(this, void 0, void 0, function () {
        var now, portfolioService, portfolios, fedReservePortfolio, positions;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    now = datetime_1.ZonedDateTime.now();
                    portfolioService = new PortfolioService_1.PortfolioService();
                    return [4 /*yield*/, portfolioService.searchPortfolio(now.toProto(), field_pb_1.FieldProto.PORTFOLIO_NAME, "Federal Reserve SOMA Holdings")];
                case 1:
                    portfolios = _a.sent();
                    fedReservePortfolio = portfolios[0];
                    return [4 /*yield*/, get_position(null, fedReservePortfolio, [measure_pb_1.MeasureProto.DIRECTED_QUANTITY], position_pb_1.PositionTypeProto.TRANSACTION, [field_pb_1.FieldProto.PORTFOLIO_NAME, field_pb_1.FieldProto.SECURITY_ID], [], now)];
                case 2:
                    positions = _a.sent();
                    console.log(positions);
                    return [2 /*return*/, true];
            }
        });
    });
}
//# sourceMappingURL=position.test.js.map