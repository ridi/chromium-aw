package org.chromium.mojo.system.impl;

import J.N;
import java.lang.Integer;
import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.mojo.system.MessagePipeHandle;
import org.chromium.mojo.system.ResultAnd;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class CoreImplJni implements CoreImpl.Natives {
  private static CoreImpl.Natives testInstance;

  public static final JniStaticTestMocker<CoreImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.mojo.system.impl.CoreImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.mojo.system.impl.CoreImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getTimeTicksNow(CoreImpl caller) {
    return (long)N.M48BvrvK(caller);
  }

  @Override
  public ResultAnd<CoreImpl.IntegerPair> createMessagePipe(CoreImpl caller,
      ByteBuffer optionsBuffer) {
    return (ResultAnd<CoreImpl.IntegerPair>)N.MZhgS7uU(caller, optionsBuffer);
  }

  @Override
  public ResultAnd<CoreImpl.IntegerPair> createDataPipe(CoreImpl caller, ByteBuffer optionsBuffer) {
    return (ResultAnd<CoreImpl.IntegerPair>)N.MhNaf1lV(caller, optionsBuffer);
  }

  @Override
  public ResultAnd<Integer> createSharedBuffer(CoreImpl caller, ByteBuffer optionsBuffer,
      long numBytes) {
    return (ResultAnd<Integer>)N.MZ0nRPS0(caller, optionsBuffer, numBytes);
  }

  @Override
  public int close(CoreImpl caller, int mojoHandle) {
    return (int)N.MLQe1QEw(caller, mojoHandle);
  }

  @Override
  public int queryHandleSignalsState(CoreImpl caller, int mojoHandle,
      ByteBuffer signalsStateBuffer) {
    return (int)N.MJr0GcyT(caller, mojoHandle, signalsStateBuffer);
  }

  @Override
  public int writeMessage(CoreImpl caller, int mojoHandle, ByteBuffer bytes, int numBytes,
      ByteBuffer handlesBuffer, int flags) {
    return (int)N.Mkun8eIV(caller, mojoHandle, bytes, numBytes, handlesBuffer, flags);
  }

  @Override
  public ResultAnd<MessagePipeHandle.ReadMessageResult> readMessage(CoreImpl caller, int mojoHandle,
      int flags) {
    return (ResultAnd<MessagePipeHandle.ReadMessageResult>)N.MEHdfwD0(caller, mojoHandle, flags);
  }

  @Override
  public ResultAnd<Integer> readData(CoreImpl caller, int mojoHandle, ByteBuffer elements,
      int elementsSize, int flags) {
    return (ResultAnd<Integer>)N.MBDORBtR(caller, mojoHandle, elements, elementsSize, flags);
  }

  @Override
  public ResultAnd<ByteBuffer> beginReadData(CoreImpl caller, int mojoHandle, int numBytes,
      int flags) {
    return (ResultAnd<ByteBuffer>)N.M_DxS0Vi(caller, mojoHandle, numBytes, flags);
  }

  @Override
  public int endReadData(CoreImpl caller, int mojoHandle, int numBytesRead) {
    return (int)N.MC3EsLAG(caller, mojoHandle, numBytesRead);
  }

  @Override
  public ResultAnd<Integer> writeData(CoreImpl caller, int mojoHandle, ByteBuffer elements,
      int limit, int flags) {
    return (ResultAnd<Integer>)N.Mra2dnT9(caller, mojoHandle, elements, limit, flags);
  }

  @Override
  public ResultAnd<ByteBuffer> beginWriteData(CoreImpl caller, int mojoHandle, int numBytes,
      int flags) {
    return (ResultAnd<ByteBuffer>)N.M100xOXT(caller, mojoHandle, numBytes, flags);
  }

  @Override
  public int endWriteData(CoreImpl caller, int mojoHandle, int numBytesWritten) {
    return (int)N.MBed1sI2(caller, mojoHandle, numBytesWritten);
  }

  @Override
  public ResultAnd<Integer> duplicate(CoreImpl caller, int mojoHandle, ByteBuffer optionsBuffer) {
    return (ResultAnd<Integer>)N.M6nJbV6M(caller, mojoHandle, optionsBuffer);
  }

  @Override
  public ResultAnd<ByteBuffer> map(CoreImpl caller, int mojoHandle, long offset, long numBytes,
      int flags) {
    return (ResultAnd<ByteBuffer>)N.Mm6zKFIo(caller, mojoHandle, offset, numBytes, flags);
  }

  @Override
  public int unmap(CoreImpl caller, ByteBuffer buffer) {
    return (int)N.MC_p8PYl(caller, buffer);
  }

  @Override
  public int getNativeBufferOffset(CoreImpl caller, ByteBuffer buffer, int alignment) {
    return (int)N.MBIRtXF8(caller, buffer, alignment);
  }

  public static CoreImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.CoreImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new CoreImplJni();
  }
}
