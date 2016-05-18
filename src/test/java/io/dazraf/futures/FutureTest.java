package io.dazraf.futures;

import io.vertx.core.Future;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FutureTest {
  @Test
  public void failedFutureWithNullThrowableShouldBeCompletedAndFailed() {
    Throwable badThrowable = null;
    Future<String> future = Future.failedFuture(badThrowable);
    assertTrue(future.isComplete());
    assertTrue(future.failed());
  }

  @Test
  public void failingAFutureWithNullThrowableShouldBeCompletedAndFailed() {
    Throwable badThrowable = null;
    Future<String> future = Future.future();
    future.fail(badThrowable);
    assertTrue(future.isComplete());
    assertTrue(future.failed());
  }
}
