/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.base.process_launcher;
public interface IParentProcess extends android.os.IInterface
{
  /** Default implementation for IParentProcess. */
  public static class Default implements org.chromium.base.process_launcher.IParentProcess
  {
    // Sends the child pid to the parent process. This will be called before any
    // third-party code is loaded, and will be a no-op after the first call.

    @Override public void sendPid(int pid) throws android.os.RemoteException
    {
    }
    // Report exception before calling into native main method. This is before
    // crash reporting is initialized, which means this exception would
    // otherwise not be reported.
    // Not oneway to ensure the browser receives the message before child exits.

    @Override public void reportExceptionInInit(java.lang.String exception) throws android.os.RemoteException
    {
    }
    // Tells the parent proces the child exited cleanly. Not oneway to ensure
    // the browser receives the message before child exits.

    @Override public void reportCleanExit() throws android.os.RemoteException
    {
    }
    // Sends the PID and startup time of the app zygote if available.

    @Override public void sendZygoteInfo(int zygotePid, long startupTimeMillis) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.base.process_launcher.IParentProcess
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.base.process_launcher.IParentProcess";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.base.process_launcher.IParentProcess interface,
     * generating a proxy if needed.
     */
    public static org.chromium.base.process_launcher.IParentProcess asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.base.process_launcher.IParentProcess))) {
        return ((org.chromium.base.process_launcher.IParentProcess)iin);
      }
      return new org.chromium.base.process_launcher.IParentProcess.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_sendPid:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.sendPid(_arg0);
          return true;
        }
        case TRANSACTION_reportExceptionInInit:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.reportExceptionInInit(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_reportCleanExit:
        {
          data.enforceInterface(descriptor);
          this.reportCleanExit();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sendZygoteInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          long _arg1;
          _arg1 = data.readLong();
          this.sendZygoteInfo(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.base.process_launcher.IParentProcess
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      // Sends the child pid to the parent process. This will be called before any
      // third-party code is loaded, and will be a no-op after the first call.

      @Override public void sendPid(int pid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendPid, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendPid(pid);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      // Report exception before calling into native main method. This is before
      // crash reporting is initialized, which means this exception would
      // otherwise not be reported.
      // Not oneway to ensure the browser receives the message before child exits.

      @Override public void reportExceptionInInit(java.lang.String exception) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(exception);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reportExceptionInInit, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().reportExceptionInInit(exception);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Tells the parent proces the child exited cleanly. Not oneway to ensure
      // the browser receives the message before child exits.

      @Override public void reportCleanExit() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reportCleanExit, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().reportCleanExit();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Sends the PID and startup time of the app zygote if available.

      @Override public void sendZygoteInfo(int zygotePid, long startupTimeMillis) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(zygotePid);
          _data.writeLong(startupTimeMillis);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendZygoteInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendZygoteInfo(zygotePid, startupTimeMillis);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.base.process_launcher.IParentProcess sDefaultImpl;
    }
    static final int TRANSACTION_sendPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_reportExceptionInInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_reportCleanExit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_sendZygoteInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(org.chromium.base.process_launcher.IParentProcess impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.base.process_launcher.IParentProcess getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Sends the child pid to the parent process. This will be called before any
  // third-party code is loaded, and will be a no-op after the first call.

  public void sendPid(int pid) throws android.os.RemoteException;
  // Report exception before calling into native main method. This is before
  // crash reporting is initialized, which means this exception would
  // otherwise not be reported.
  // Not oneway to ensure the browser receives the message before child exits.

  public void reportExceptionInInit(java.lang.String exception) throws android.os.RemoteException;
  // Tells the parent proces the child exited cleanly. Not oneway to ensure
  // the browser receives the message before child exits.

  public void reportCleanExit() throws android.os.RemoteException;
  // Sends the PID and startup time of the app zygote if available.

  public void sendZygoteInfo(int zygotePid, long startupTimeMillis) throws android.os.RemoteException;
}
