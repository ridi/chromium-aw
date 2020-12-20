/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.android_webview.common.services;
public interface ICrashReceiverService extends android.os.IInterface
{
  /** Default implementation for ICrashReceiverService. */
  public static class Default implements org.chromium.android_webview.common.services.ICrashReceiverService
  {
    @Override public void transmitCrashes(android.os.ParcelFileDescriptor[] fileDescriptors, java.util.List crashInfo) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.android_webview.common.services.ICrashReceiverService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.android_webview.common.services.ICrashReceiverService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.android_webview.common.services.ICrashReceiverService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.android_webview.common.services.ICrashReceiverService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.android_webview.common.services.ICrashReceiverService))) {
        return ((org.chromium.android_webview.common.services.ICrashReceiverService)iin);
      }
      return new org.chromium.android_webview.common.services.ICrashReceiverService.Stub.Proxy(obj);
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
        case TRANSACTION_transmitCrashes:
        {
          data.enforceInterface(descriptor);
          android.os.ParcelFileDescriptor[] _arg0;
          _arg0 = data.createTypedArray(android.os.ParcelFileDescriptor.CREATOR);
          java.util.List _arg1;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg1 = data.readArrayList(cl);
          this.transmitCrashes(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.android_webview.common.services.ICrashReceiverService
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
      @Override public void transmitCrashes(android.os.ParcelFileDescriptor[] fileDescriptors, java.util.List crashInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(fileDescriptors, 0);
          _data.writeList(crashInfo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_transmitCrashes, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().transmitCrashes(fileDescriptors, crashInfo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.android_webview.common.services.ICrashReceiverService sDefaultImpl;
    }
    static final int TRANSACTION_transmitCrashes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.android_webview.common.services.ICrashReceiverService impl) {
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
    public static org.chromium.android_webview.common.services.ICrashReceiverService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void transmitCrashes(android.os.ParcelFileDescriptor[] fileDescriptors, java.util.List crashInfo) throws android.os.RemoteException;
}
