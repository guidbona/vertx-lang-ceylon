/* Generated from io.vertx.core.streams.ReadStream<T> */
shared interface ReadStream<T> satisfies StreamBase {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal Anything(*<[Anything(T)]>) handler;
  shared formal Anything(*<[]>) pause;
  shared formal Anything(*<[]>) resume;
  shared formal Anything(*<[Anything()]>) endHandler;
}