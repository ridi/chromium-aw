/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.android_webview.common.services;
public interface ISafeModeService extends android.os.IInterface
{
  /** Default implementation for ISafeModeService. */
  public static class Default implements org.chromium.android_webview.common.services.ISafeModeService
  {
    // Sets the WebView SafeMode config in the WebView provider's SafeModeService. This config will
    // apply to all WebView-based apps.
    //
    // `actions` is a collection of Strings, each of which represents a SafeModeAction. Passing an
    //     empty list will disable SafeMode.
    //
    // Only certain trusted (Google-managed) services are permitted to call this API, as determined
    // by an allowlist. If the caller's UID does not match a trusted package (determined by both
    // package name and signing certificate, looked up via the system PackageManager),
    // SafeModeService will throw a SecurityException.

    @Override public void setSafeMode(java.util.List<java.lang.String> actions) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.android_webview.common.services.ISafeModeService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.android_webview.common.services.ISafeModeService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.android_webview.common.services.ISafeModeService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.android_webview.common.services.ISafeModeService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.android_webview.common.services.ISafeModeService))) {
        return ((org.chromium.android_webview.common.services.ISafeModeService)iin);
      }
      return new org.chromium.android_webview.common.services.ISafeModeService.Stub.Proxy(obj);
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
        case TRANSACTION_setSafeMode:
        {
          data.enforceInterface(descriptor);
          java.util.List<java.lang.String> _arg0;
          _arg0 = data.createStringArrayList();
          this.setSafeMode(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.android_webview.common.services.ISafeModeService
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
      // Sets the WebView SafeMode config in the WebView provider's SafeModeService. This config will
      // apply to all WebView-based apps.
      //
      // `actions` is a collection of Strings, each of which represents a SafeModeAction. Passing an
      //     empty list will disable SafeMode.
      //
      // Only certain trusted (Google-managed) services are permitted to call this API, as determined
      // by an allowlist. If the caller's UID does not match a trusted package (determined by both
      // package name and signing certificate, looked up via the system PackageManager),
      // SafeModeService will throw a SecurityException.

      @Override public void setSafeMode(java.util.List<java.lang.String> actions) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringList(actions);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSafeMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setSafeMode(actions);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.android_webview.common.services.ISafeModeService sDefaultImpl;
    }
    static final int TRANSACTION_setSafeMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.android_webview.common.services.ISafeModeService impl) {
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
    public static org.chromium.android_webview.common.services.ISafeModeService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Sets the WebView SafeMode config in the WebView provider's SafeModeService. This config will
  // apply to all WebView-based apps.
  //
  // `actions` is a collection of Strings, each of which represents a SafeModeAction. Passing an
  //     empty list will disable SafeMode.
  //
  // Only certain trusted (Google-managed) services are permitted to call this API, as determined
  // by an allowlist. If the caller's UID does not match a trusted package (determined by both
  // package name and signing certificate, looked up via the system PackageManager),
  // SafeModeService will throw a SecurityException.

  public void setSafeMode(java.util.List<java.lang.String> actions) throws android.os.RemoteException;
}
