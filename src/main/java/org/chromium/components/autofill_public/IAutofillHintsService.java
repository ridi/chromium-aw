/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.autofill_public;
/**
 * Interface to provide the autofill hints that are unable to be supported
 * by Android framework.
 *
 * The autofill service could get the binder from ViewStructure.
 *     Bundle bundle = viewStructure.getExtras();
 *     IBinder binder = bundle.getBinder("AUTOFILL_HINTS_SERVICE");
 */
public interface IAutofillHintsService extends android.os.IInterface
{
  /** Default implementation for IAutofillHintsService. */
  public static class Default implements org.chromium.components.autofill_public.IAutofillHintsService
  {
    // Register the IViewTypeCallback to get the server prediction type.

    @Override public void registerViewTypeCallback(org.chromium.components.autofill_public.IViewTypeCallback callback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.autofill_public.IAutofillHintsService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.components.autofill_public.IAutofillHintsService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.autofill_public.IAutofillHintsService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.autofill_public.IAutofillHintsService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.autofill_public.IAutofillHintsService))) {
        return ((org.chromium.components.autofill_public.IAutofillHintsService)iin);
      }
      return new org.chromium.components.autofill_public.IAutofillHintsService.Stub.Proxy(obj);
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
        case TRANSACTION_registerViewTypeCallback:
        {
          data.enforceInterface(descriptor);
          org.chromium.components.autofill_public.IViewTypeCallback _arg0;
          _arg0 = org.chromium.components.autofill_public.IViewTypeCallback.Stub.asInterface(data.readStrongBinder());
          this.registerViewTypeCallback(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.autofill_public.IAutofillHintsService
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
      // Register the IViewTypeCallback to get the server prediction type.

      @Override public void registerViewTypeCallback(org.chromium.components.autofill_public.IViewTypeCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerViewTypeCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerViewTypeCallback(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.components.autofill_public.IAutofillHintsService sDefaultImpl;
    }
    static final int TRANSACTION_registerViewTypeCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.components.autofill_public.IAutofillHintsService impl) {
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
    public static org.chromium.components.autofill_public.IAutofillHintsService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Register the IViewTypeCallback to get the server prediction type.

  public void registerViewTypeCallback(org.chromium.components.autofill_public.IViewTypeCallback callback) throws android.os.RemoteException;
}
