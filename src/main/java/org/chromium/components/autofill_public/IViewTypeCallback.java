/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.autofill_public;
/**
 * The interface for AutofillHintsService to provide the type of view.
 */
public interface IViewTypeCallback extends android.os.IInterface
{
  /** Default implementation for IViewTypeCallback. */
  public static class Default implements org.chromium.components.autofill_public.IViewTypeCallback
  {
    // Invoked when the query succeeds, though the server might not have the
    // prediction of the views.

    @Override public void onViewTypeAvailable(java.util.List<org.chromium.components.autofill_public.ViewType> viewTypes) throws android.os.RemoteException
    {
    }
    // Invoked when the query fails, mostly because of the connection or server
    // error.

    @Override public void onQueryFailed() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.autofill_public.IViewTypeCallback
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.components.autofill_public.IViewTypeCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.autofill_public.IViewTypeCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.autofill_public.IViewTypeCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.autofill_public.IViewTypeCallback))) {
        return ((org.chromium.components.autofill_public.IViewTypeCallback)iin);
      }
      return new org.chromium.components.autofill_public.IViewTypeCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onViewTypeAvailable:
        {
          data.enforceInterface(descriptor);
          java.util.List<org.chromium.components.autofill_public.ViewType> _arg0;
          _arg0 = data.createTypedArrayList(org.chromium.components.autofill_public.ViewType.CREATOR);
          this.onViewTypeAvailable(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onQueryFailed:
        {
          data.enforceInterface(descriptor);
          this.onQueryFailed();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.autofill_public.IViewTypeCallback
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
      // Invoked when the query succeeds, though the server might not have the
      // prediction of the views.

      @Override public void onViewTypeAvailable(java.util.List<org.chromium.components.autofill_public.ViewType> viewTypes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(viewTypes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onViewTypeAvailable, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onViewTypeAvailable(viewTypes);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Invoked when the query fails, mostly because of the connection or server
      // error.

      @Override public void onQueryFailed() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onQueryFailed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onQueryFailed();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.components.autofill_public.IViewTypeCallback sDefaultImpl;
    }
    static final int TRANSACTION_onViewTypeAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onQueryFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(org.chromium.components.autofill_public.IViewTypeCallback impl) {
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
    public static org.chromium.components.autofill_public.IViewTypeCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Invoked when the query succeeds, though the server might not have the
  // prediction of the views.

  public void onViewTypeAvailable(java.util.List<org.chromium.components.autofill_public.ViewType> viewTypes) throws android.os.RemoteException;
  // Invoked when the query fails, mostly because of the connection or server
  // error.

  public void onQueryFailed() throws android.os.RemoteException;
}
