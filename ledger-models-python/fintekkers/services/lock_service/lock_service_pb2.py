# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: fintekkers/services/lock-service/lock_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from fintekkers.requests.util.lock import lock_request_pb2 as fintekkers_dot_requests_dot_util_dot_lock_dot_lock__request__pb2
from fintekkers.requests.util.lock import lock_response_pb2 as fintekkers_dot_requests_dot_util_dot_lock_dot_lock__response__pb2
from fintekkers.models.util.lock import node_partition_pb2 as fintekkers_dot_models_dot_util_dot_lock_dot_node__partition__pb2
from fintekkers.models.util.lock import node_state_pb2 as fintekkers_dot_models_dot_util_dot_lock_dot_node__state__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3fintekkers/services/lock-service/lock_service.proto\x12 fintekkers.services.lock_service\x1a\x1bgoogle/protobuf/empty.proto\x1a\x30\x66intekkers/requests/util/lock/lock_request.proto\x1a\x31\x66intekkers/requests/util/lock/lock_response.proto\x1a\x30\x66intekkers/models/util/lock/node_partition.proto\x1a,fintekkers/models/util/lock/node_state.proto\"#\n\rNamespaceList\x12\x12\n\nnamespaces\x18\x01 \x03(\t\"P\n\x0ePartitionsList\x12>\n\npartitions\x18\x01 \x03(\x0b\x32*.fintekkers.models.util.lock.NodePartition\"F\n\rNodeStateList\x12\x35\n\x05nodes\x18\x01 \x03(\x0b\x32&.fintekkers.models.util.lock.NodeState\"&\n\x16\x43reateNamespaceRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"9\n\x16\x43reatePartitionRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x11\n\tpartition\x18\x02 \x01(\x05\x32\xc1\x07\n\x04Lock\x12n\n\tClaimLock\x12/.fintekkers.requests.util.lock.LockRequestProto\x1a\x30.fintekkers.requests.util.lock.LockResponseProto\x12Z\n\x16SubscribeToLockUpdates\x12\x16.google.protobuf.Empty\x1a&.fintekkers.models.util.lock.NodeState0\x01\x12\x63\n\x0f\x43reateNamespace\x12\x38.fintekkers.services.lock_service.CreateNamespaceRequest\x1a\x16.google.protobuf.Empty\x12\x63\n\x0f\x43reatePartition\x12\x38.fintekkers.services.lock_service.CreatePartitionRequest\x1a\x16.google.protobuf.Empty\x12Y\n\x0eListNamespaces\x12\x16.google.protobuf.Empty\x1a/.fintekkers.services.lock_service.NamespaceList\x12s\n\x0eListPartitions\x12/.fintekkers.services.lock_service.NamespaceList\x1a\x30.fintekkers.services.lock_service.PartitionsList\x12`\n\x15GetAllPartitionStatus\x12\x16.google.protobuf.Empty\x1a/.fintekkers.services.lock_service.NodeStateList\x12\x86\x01\n\"GetAllPartitionStatusForNamespaces\x12/.fintekkers.services.lock_service.NamespaceList\x1a/.fintekkers.services.lock_service.NodeStateList\x12h\n\x12GetPartitionStatus\x12*.fintekkers.models.util.lock.NodePartition\x1a&.fintekkers.models.util.lock.NodeStateB\x03\x88\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'fintekkers.services.lock_service.lock_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\210\001\001'
  _NAMESPACELIST._serialized_start=315
  _NAMESPACELIST._serialized_end=350
  _PARTITIONSLIST._serialized_start=352
  _PARTITIONSLIST._serialized_end=432
  _NODESTATELIST._serialized_start=434
  _NODESTATELIST._serialized_end=504
  _CREATENAMESPACEREQUEST._serialized_start=506
  _CREATENAMESPACEREQUEST._serialized_end=544
  _CREATEPARTITIONREQUEST._serialized_start=546
  _CREATEPARTITIONREQUEST._serialized_end=603
  _LOCK._serialized_start=606
  _LOCK._serialized_end=1567
# @@protoc_insertion_point(module_scope)
