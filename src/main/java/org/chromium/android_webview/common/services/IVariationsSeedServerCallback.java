/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.android_webview.common.services;
/**
 * Used to communicate variations seed related information from WebView's
 * service to an embedding app.
 */
public interface IVariationsSeedServerCallback extends android.os.IInterface
{
  /** Default implementation for IVariationsSeedServerCallback. */
  public static class Default implements org.chromium.android_webview.common.services.IVariationsSeedServerCallback
  {
    // Notifies the embedding app that metrics related to the variations
    // service are available for reporting. See VariationsServiceMetricsHelper
    // for information on the contents of the |metrics| parameter.

    @Override public void reportVariationsServiceMetrics(android.os.Bundle metrics) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.android_webview.common.services.IVariationsSeedServerCallback
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.android_webview.common.services.IVariationsSeedServerCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.android_webview.common.services.IVariationsSeedServerCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.android_webview.common.services.IVariationsSeedServerCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.android_webview.common.services.IVariationsSeedServerCallback))) {
        return ((org.chromium.android_webview.common.services.IVariationsSeedServerCallback)iin);
      }
      return new org.chromium.android_webview.common.services.IVariationsSeedServerCallback.Stub.Proxy(obj);
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
        case TRANSACTION_reportVariationsServiceMetrics:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.reportVariationsServiceMetrics(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.android_webview.common.services.IVariationsSeedServerCallback
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
      // Notifies the embedding app that metrics related to the variations
      // service are available for reporting. See VariationsServiceMetricsHelper
      // for information on the contents of the |metrics| parameter.

      @Override public void reportVariationsServiceMetrics(android.os.Bundle metrics) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((metrics!=null)) {
            _data.writeInt(1);
            metrics.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_reportVariationsServiceMetrics, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().reportVariationsServiceMetrics(metrics);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.android_webview.common.services.IVariationsSeedServerCallback sDefaultImpl;
    }
    static final int TRANSACTION_reportVariationsServiceMetrics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.android_webview.common.services.IVariationsSeedServerCallback impl) {
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
    public static org.chromium.android_webview.common.services.IVariationsSeedServerCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Notifies the embedding app that metrics related to the variations
  // service are available for reporting. See VariationsServiceMetricsHelper
  // for information on the contents of the |metrics| parameter.

  public void reportVariationsServiceMetrics(android.os.Bundle metrics) throws android.os.RemoteException;
}
