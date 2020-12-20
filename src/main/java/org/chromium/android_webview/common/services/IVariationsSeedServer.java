/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.android_webview.common.services;
public interface IVariationsSeedServer extends android.os.IInterface
{
  /** Default implementation for IVariationsSeedServer. */
  public static class Default implements org.chromium.android_webview.common.services.IVariationsSeedServer
  {
    // Apps request variations seeds from WebView's service by calling this interface. They should
    // pass the "date" field of their current seed as oldSeedDate (in milliseconds since epoch), or
    // Long.MIN_VALUE to indicate they have no seed. If the service's latest seed is newer than
    // oldSeedDate, the service will write it to newSeedFile. callback may be used to pass
    // information back to the embedding app from the service.

    @Override public void getSeed(android.os.ParcelFileDescriptor newSeedFile, long oldSeedDate, org.chromium.android_webview.common.services.IVariationsSeedServerCallback callback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.android_webview.common.services.IVariationsSeedServer
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.android_webview.common.services.IVariationsSeedServer";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.android_webview.common.services.IVariationsSeedServer interface,
     * generating a proxy if needed.
     */
    public static org.chromium.android_webview.common.services.IVariationsSeedServer asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.android_webview.common.services.IVariationsSeedServer))) {
        return ((org.chromium.android_webview.common.services.IVariationsSeedServer)iin);
      }
      return new org.chromium.android_webview.common.services.IVariationsSeedServer.Stub.Proxy(obj);
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
        case TRANSACTION_getSeed:
        {
          data.enforceInterface(descriptor);
          android.os.ParcelFileDescriptor _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          long _arg1;
          _arg1 = data.readLong();
          org.chromium.android_webview.common.services.IVariationsSeedServerCallback _arg2;
          _arg2 = org.chromium.android_webview.common.services.IVariationsSeedServerCallback.Stub.asInterface(data.readStrongBinder());
          this.getSeed(_arg0, _arg1, _arg2);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.android_webview.common.services.IVariationsSeedServer
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
      // Apps request variations seeds from WebView's service by calling this interface. They should
      // pass the "date" field of their current seed as oldSeedDate (in milliseconds since epoch), or
      // Long.MIN_VALUE to indicate they have no seed. If the service's latest seed is newer than
      // oldSeedDate, the service will write it to newSeedFile. callback may be used to pass
      // information back to the embedding app from the service.

      @Override public void getSeed(android.os.ParcelFileDescriptor newSeedFile, long oldSeedDate, org.chromium.android_webview.common.services.IVariationsSeedServerCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((newSeedFile!=null)) {
            _data.writeInt(1);
            newSeedFile.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeLong(oldSeedDate);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSeed, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getSeed(newSeedFile, oldSeedDate, callback);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.android_webview.common.services.IVariationsSeedServer sDefaultImpl;
    }
    static final int TRANSACTION_getSeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.android_webview.common.services.IVariationsSeedServer impl) {
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
    public static org.chromium.android_webview.common.services.IVariationsSeedServer getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Apps request variations seeds from WebView's service by calling this interface. They should
  // pass the "date" field of their current seed as oldSeedDate (in milliseconds since epoch), or
  // Long.MIN_VALUE to indicate they have no seed. If the service's latest seed is newer than
  // oldSeedDate, the service will write it to newSeedFile. callback may be used to pass
  // information back to the embedding app from the service.

  public void getSeed(android.os.ParcelFileDescriptor newSeedFile, long oldSeedDate, org.chromium.android_webview.common.services.IVariationsSeedServerCallback callback) throws android.os.RemoteException;
}
