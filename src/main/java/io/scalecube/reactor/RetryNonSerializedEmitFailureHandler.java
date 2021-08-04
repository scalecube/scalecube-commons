package io.scalecube.reactor;

import reactor.core.publisher.SignalType;
import reactor.core.publisher.Sinks.EmitFailureHandler;
import reactor.core.publisher.Sinks.EmitResult;

public class RetryNonSerializedEmitFailureHandler implements EmitFailureHandler {

  public static final RetryNonSerializedEmitFailureHandler RETRY_NON_SERIALIZED =
      new RetryNonSerializedEmitFailureHandler();

  @Override
  public boolean onEmitFailure(SignalType signalType, EmitResult emitResult) {
    return emitResult == EmitResult.FAIL_NON_SERIALIZED;
  }
}
