# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: fintekkers/services/security-service/security_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from fintekkers.requests.security import query_security_request_pb2 as fintekkers_dot_requests_dot_security_dot_query__security__request__pb2
from fintekkers.requests.security import query_security_response_pb2 as fintekkers_dot_requests_dot_security_dot_query__security__response__pb2
from fintekkers.requests.security import create_security_request_pb2 as fintekkers_dot_requests_dot_security_dot_create__security__request__pb2
from fintekkers.requests.security import create_security_response_pb2 as fintekkers_dot_requests_dot_security_dot_create__security__response__pb2
from fintekkers.requests.util.errors import summary_pb2 as fintekkers_dot_requests_dot_util_dot_errors_dot_summary__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;fintekkers/services/security-service/security_service.proto\x12$fintekkers.services.security_service\x1a\x39\x66intekkers/requests/security/query_security_request.proto\x1a:fintekkers/requests/security/query_security_response.proto\x1a:fintekkers/requests/security/create_security_request.proto\x1a;fintekkers/requests/security/create_security_response.proto\x1a-fintekkers/requests/util/errors/summary.proto2\x92\x06\n\x08Security\x12\x85\x01\n\x0e\x43reateOrUpdate\x12\x38.fintekkers.requests.security.CreateSecurityRequestProto\x1a\x39.fintekkers.requests.security.CreateSecurityResponseProto\x12}\n\x08GetByIDs\x12\x37.fintekkers.requests.security.QuerySecurityRequestProto\x1a\x38.fintekkers.requests.security.QuerySecurityResponseProto\x12}\n\x06Search\x12\x37.fintekkers.requests.security.QuerySecurityRequestProto\x1a\x38.fintekkers.requests.security.QuerySecurityResponseProto0\x01\x12|\n\x07ListIDs\x12\x37.fintekkers.requests.security.QuerySecurityRequestProto\x1a\x38.fintekkers.requests.security.QuerySecurityResponseProto\x12\x81\x01\n\x16ValidateCreateOrUpdate\x12\x38.fintekkers.requests.security.CreateSecurityRequestProto\x1a-.fintekkers.requests.util.errors.SummaryProto\x12~\n\x14ValidateQueryRequest\x12\x37.fintekkers.requests.security.QuerySecurityRequestProto\x1a-.fintekkers.requests.util.errors.SummaryProtoB\x06\x88\x01\x01\x90\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'fintekkers.services.security_service.security_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\210\001\001\220\001\001'
  _SECURITY._serialized_start=389
  _SECURITY._serialized_end=1175
_builder.BuildServices(DESCRIPTOR, 'fintekkers.services.security_service.security_service_pb2', globals())
# @@protoc_insertion_point(module_scope)
