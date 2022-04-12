// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: challenger.proto

package com.grpc;

public final class ChallengerOuterClass {
  private ChallengerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_Batch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_Batch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_Benchmark_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_Benchmark_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_Indicator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_Indicator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_ResultQ1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_ResultQ1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_CrossoverEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_CrossoverEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_ResultQ2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_ResultQ2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Challenger_BenchmarkConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Challenger_BenchmarkConfiguration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020challenger.proto\022\nChallenger\032\033google/p" +
      "rotobuf/empty.proto\032\037google/protobuf/tim" +
      "estamp.proto\"\222\001\n\005Event\022\016\n\006symbol\030\001 \001(\t\022/" +
      "\n\rsecurity_type\030\002 \001(\0162\030.Challenger.Secur" +
      "ityType\022\030\n\020last_trade_price\030\003 \001(\002\022.\n\nlas" +
      "t_trade\030\004 \001(\0132\032.google.protobuf.Timestam" +
      "p\"`\n\005Batch\022\016\n\006seq_id\030\001 \001(\003\022\014\n\004last\030\002 \001(\010" +
      "\022\026\n\016lookup_symbols\030\003 \003(\t\022!\n\006events\030\004 \003(\013" +
      "2\021.Challenger.Event\"\027\n\tBenchmark\022\n\n\002id\030\001" +
      " \001(\003\"<\n\tIndicator\022\016\n\006symbol\030\001 \001(\t\022\016\n\006ema" +
      "_38\030\002 \001(\002\022\017\n\007ema_100\030\003 \001(\002\"a\n\010ResultQ1\022\024" +
      "\n\014benchmark_id\030\001 \001(\003\022\024\n\014batch_seq_id\030\002 \001" +
      "(\003\022)\n\nindicators\030\003 \003(\0132\025.Challenger.Indi" +
      "cator\"\326\001\n\016CrossoverEvent\022&\n\002ts\030\001 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022\016\n\006symbol\030\002 \001(\t" +
      "\022/\n\rsecurity_type\030\003 \001(\0162\030.Challenger.Sec" +
      "urityType\022:\n\013signal_type\030\004 \001(\0162%.Challen" +
      "ger.CrossoverEvent.SignalType\"\037\n\nSignalT" +
      "ype\022\007\n\003Buy\020\000\022\010\n\004Sell\020\001\"l\n\010ResultQ2\022\024\n\014be" +
      "nchmark_id\030\001 \001(\003\022\024\n\014batch_seq_id\030\002 \001(\003\0224" +
      "\n\020crossover_events\030\003 \003(\0132\032.Challenger.Cr" +
      "ossoverEvent\"{\n\026BenchmarkConfiguration\022\r" +
      "\n\005token\030\001 \001(\t\022\026\n\016benchmark_name\030\002 \001(\t\022\026\n" +
      "\016benchmark_type\030\003 \001(\t\022\"\n\007queries\030\004 \003(\0162\021" +
      ".Challenger.Query*%\n\014SecurityType\022\n\n\006Equ" +
      "ity\020\000\022\t\n\005Index\020\001*\027\n\005Query\022\006\n\002Q1\020\000\022\006\n\002Q2\020" +
      "\0012\210\003\n\nChallenger\022O\n\022createNewBenchmark\022\"" +
      ".Challenger.BenchmarkConfiguration\032\025.Cha" +
      "llenger.Benchmark\022?\n\016startBenchmark\022\025.Ch" +
      "allenger.Benchmark\032\026.google.protobuf.Emp" +
      "ty\0225\n\tnextBatch\022\025.Challenger.Benchmark\032\021" +
      ".Challenger.Batch\0228\n\010resultQ1\022\024.Challeng" +
      "er.ResultQ1\032\026.google.protobuf.Empty\0228\n\010r" +
      "esultQ2\022\024.Challenger.ResultQ2\032\026.google.p" +
      "rotobuf.Empty\022=\n\014endBenchmark\022\025.Challeng" +
      "er.Benchmark\032\026.google.protobuf.EmptyB\014\n\010" +
      "com.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_Challenger_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Challenger_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_Event_descriptor,
        new java.lang.String[] { "Symbol", "SecurityType", "LastTradePrice", "LastTrade", });
    internal_static_Challenger_Batch_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Challenger_Batch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_Batch_descriptor,
        new java.lang.String[] { "SeqId", "Last", "LookupSymbols", "Events", });
    internal_static_Challenger_Benchmark_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Challenger_Benchmark_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_Benchmark_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_Challenger_Indicator_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Challenger_Indicator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_Indicator_descriptor,
        new java.lang.String[] { "Symbol", "Ema38", "Ema100", });
    internal_static_Challenger_ResultQ1_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Challenger_ResultQ1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_ResultQ1_descriptor,
        new java.lang.String[] { "BenchmarkId", "BatchSeqId", "Indicators", });
    internal_static_Challenger_CrossoverEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Challenger_CrossoverEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_CrossoverEvent_descriptor,
        new java.lang.String[] { "Ts", "Symbol", "SecurityType", "SignalType", });
    internal_static_Challenger_ResultQ2_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Challenger_ResultQ2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_ResultQ2_descriptor,
        new java.lang.String[] { "BenchmarkId", "BatchSeqId", "CrossoverEvents", });
    internal_static_Challenger_BenchmarkConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Challenger_BenchmarkConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Challenger_BenchmarkConfiguration_descriptor,
        new java.lang.String[] { "Token", "BenchmarkName", "BenchmarkType", "Queries", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}