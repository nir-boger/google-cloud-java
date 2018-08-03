// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

public final class UptimeServiceProto {
  private UptimeServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListUptimeCheckConfigsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListUptimeCheckConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListUptimeCheckConfigsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListUptimeCheckConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetUptimeCheckConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetUptimeCheckConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_UpdateUptimeCheckConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateUptimeCheckConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_DeleteUptimeCheckConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteUptimeCheckConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListUptimeCheckIpsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListUptimeCheckIpsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/monitoring/v3/uptime_service.pr" +
      "oto\022\024google.monitoring.v3\032\034google/api/an" +
      "notations.proto\032!google/monitoring/v3/up" +
      "time.proto\032\033google/protobuf/empty.proto\032" +
      " google/protobuf/field_mask.proto\"V\n\035Lis" +
      "tUptimeCheckConfigsRequest\022\016\n\006parent\030\001 \001" +
      "(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(" +
      "\t\"\224\001\n\036ListUptimeCheckConfigsResponse\022E\n\024" +
      "uptime_check_configs\030\001 \003(\0132\'.google.moni" +
      "toring.v3.UptimeCheckConfig\022\027\n\017next_page" +
      "_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\005\"+\n\033GetU" +
      "ptimeCheckConfigRequest\022\014\n\004name\030\001 \001(\t\"v\n" +
      "\036CreateUptimeCheckConfigRequest\022\016\n\006paren" +
      "t\030\001 \001(\t\022D\n\023uptime_check_config\030\002 \001(\0132\'.g" +
      "oogle.monitoring.v3.UptimeCheckConfig\"\227\001" +
      "\n\036UpdateUptimeCheckConfigRequest\022/\n\013upda" +
      "te_mask\030\002 \001(\0132\032.google.protobuf.FieldMas" +
      "k\022D\n\023uptime_check_config\030\003 \001(\0132\'.google." +
      "monitoring.v3.UptimeCheckConfig\".\n\036Delet" +
      "eUptimeCheckConfigRequest\022\014\n\004name\030\001 \001(\t\"" +
      "B\n\031ListUptimeCheckIpsRequest\022\021\n\tpage_siz" +
      "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"t\n\032ListUptim" +
      "eCheckIpsResponse\022=\n\020uptime_check_ips\030\001 " +
      "\003(\0132#.google.monitoring.v3.UptimeCheckIp" +
      "\022\027\n\017next_page_token\030\002 \001(\t2\307\010\n\022UptimeChec" +
      "kService\022\267\001\n\026ListUptimeCheckConfigs\0223.go" +
      "ogle.monitoring.v3.ListUptimeCheckConfig" +
      "sRequest\0324.google.monitoring.v3.ListUpti" +
      "meCheckConfigsResponse\"2\202\323\344\223\002,\022*/v3/{par" +
      "ent=projects/*}/uptimeCheckConfigs\022\246\001\n\024G" +
      "etUptimeCheckConfig\0221.google.monitoring." +
      "v3.GetUptimeCheckConfigRequest\032\'.google." +
      "monitoring.v3.UptimeCheckConfig\"2\202\323\344\223\002,\022" +
      "*/v3/{name=projects/*/uptimeCheckConfigs" +
      "/*}\022\301\001\n\027CreateUptimeCheckConfig\0224.google" +
      ".monitoring.v3.CreateUptimeCheckConfigRe" +
      "quest\032\'.google.monitoring.v3.UptimeCheck" +
      "Config\"G\202\323\344\223\002A\"*/v3/{parent=projects/*}/" +
      "uptimeCheckConfigs:\023uptime_check_config\022" +
      "\325\001\n\027UpdateUptimeCheckConfig\0224.google.mon" +
      "itoring.v3.UpdateUptimeCheckConfigReques" +
      "t\032\'.google.monitoring.v3.UptimeCheckConf" +
      "ig\"[\202\323\344\223\002U2>/v3/{uptime_check_config.nam" +
      "e=projects/*/uptimeCheckConfigs/*}:\023upti" +
      "me_check_config\022\233\001\n\027DeleteUptimeCheckCon" +
      "fig\0224.google.monitoring.v3.DeleteUptimeC" +
      "heckConfigRequest\032\026.google.protobuf.Empt" +
      "y\"2\202\323\344\223\002,**/v3/{name=projects/*/uptimeCh" +
      "eckConfigs/*}\022\223\001\n\022ListUptimeCheckIps\022/.g" +
      "oogle.monitoring.v3.ListUptimeCheckIpsRe" +
      "quest\0320.google.monitoring.v3.ListUptimeC" +
      "heckIpsResponse\"\032\202\323\344\223\002\024\022\022/v3/uptimeCheck" +
      "IpsB\252\001\n\030com.google.monitoring.v3B\022Uptime" +
      "ServiceProtoP\001Z>google.golang.org/genpro" +
      "to/googleapis/monitoring/v3;monitoring\252\002" +
      "\032Google.Cloud.Monitoring.V3\312\002\032Google\\Clo" +
      "ud\\Monitoring\\V3b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.monitoring.v3.UptimeProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_monitoring_v3_ListUptimeCheckConfigsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListUptimeCheckConfigsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListUptimeCheckConfigsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListUptimeCheckConfigsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListUptimeCheckConfigsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListUptimeCheckConfigsResponse_descriptor,
        new java.lang.String[] { "UptimeCheckConfigs", "NextPageToken", "TotalSize", });
    internal_static_google_monitoring_v3_GetUptimeCheckConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetUptimeCheckConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetUptimeCheckConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor,
        new java.lang.String[] { "Parent", "UptimeCheckConfig", });
    internal_static_google_monitoring_v3_UpdateUptimeCheckConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateUptimeCheckConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_UpdateUptimeCheckConfigRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "UptimeCheckConfig", });
    internal_static_google_monitoring_v3_DeleteUptimeCheckConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_DeleteUptimeCheckConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_DeleteUptimeCheckConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_ListUptimeCheckIpsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_ListUptimeCheckIpsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListUptimeCheckIpsRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListUptimeCheckIpsResponse_descriptor,
        new java.lang.String[] { "UptimeCheckIps", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.monitoring.v3.UptimeProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}