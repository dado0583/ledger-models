// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/requests/portfolio/query_portfolio_request.proto

package fintekkers.requests.portfolio;

public final class QueryPortfolioRequestProtos {
  private QueryPortfolioRequestProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintekkers_requests_portfolio_QueryPortfolioRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintekkers_requests_portfolio_QueryPortfolioRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;fintekkers/requests/portfolio/query_po" +
      "rtfolio_request.proto\022\035fintekkers.reques" +
      "ts.portfolio\032!fintekkers/models/util/uui" +
      "d.proto\0320fintekkers/models/position/posi" +
      "tion_filter.proto\"\306\001\n\032QueryPortfolioRequ" +
      "estProto\022\024\n\014object_class\030\001 \001(\t\022\017\n\007versio" +
      "n\030\002 \001(\t\0220\n\005uuids\030\025 \003(\0132!.fintekkers.mode" +
      "ls.util.UUIDProto\022O\n\026search_portfolio_in" +
      "put\030\026 \001(\0132/.fintekkers.models.position.P" +
      "ositionFilterProtoB\037B\033QueryPortfolioRequ" +
      "estProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          fintekkers.models.util.Uuid.getDescriptor(),
          fintekkers.models.position.PositionFilterProtos.getDescriptor(),
        });
    internal_static_fintekkers_requests_portfolio_QueryPortfolioRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fintekkers_requests_portfolio_QueryPortfolioRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_requests_portfolio_QueryPortfolioRequestProto_descriptor,
        new java.lang.String[] { "ObjectClass", "Version", "Uuids", "SearchPortfolioInput", });
    fintekkers.models.util.Uuid.getDescriptor();
    fintekkers.models.position.PositionFilterProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}