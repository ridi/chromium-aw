/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.component_updater;
public interface IComponentsProviderService extends android.os.IInterface
{
  /** Default implementation for IComponentsProviderService. */
  public static class Default implements org.chromium.components.component_updater.IComponentsProviderService
  {
    /**
         * Request files for a component. The caller should expect that files may be missing and should
         * handle that.
         *
         * This is an asynchronous call and there is no guarantee on the order of execution of multiple
         * calls. The caller should not unbind the service until all ResultReceivers are called.
         *
         * The componentId is the unique name of the component as returned by
         * ComponentInstallerPolicy#getHash.
         *
         * On success, the resultReceiver will be called with a return code of zero and the resultData
         * Bundle will contain a HashMap that maps file paths (relative to their component directory) to
         * an open ParcelFileDescriptor. The caller is responsible for closing these file descriptors.
         * The result map can be retrieved by calling
         * resultData.getSerializable(ComponentsProviderService.KEY_RESULT) and casting the result to a
         * (HashMap<String, ParcelFileDescriptor>).
         * On failure, a non-zero result code is sent with a null Bundle.
         *
         * @param componentId the component for which to retrieve files
         * @param resultReceiver a callback to receive the result
         */
    @Override public void getFilesForComponent(java.lang.String componentId, android.os.ResultReceiver resultReceiver) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.component_updater.IComponentsProviderService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.components.component_updater.IComponentsProviderService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.component_updater.IComponentsProviderService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.component_updater.IComponentsProviderService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.component_updater.IComponentsProviderService))) {
        return ((org.chromium.components.component_updater.IComponentsProviderService)iin);
      }
      return new org.chromium.components.component_updater.IComponentsProviderService.Stub.Proxy(obj);
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
        case TRANSACTION_getFilesForComponent:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.ResultReceiver _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.ResultReceiver.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.getFilesForComponent(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.component_updater.IComponentsProviderService
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
      /**
           * Request files for a component. The caller should expect that files may be missing and should
           * handle that.
           *
           * This is an asynchronous call and there is no guarantee on the order of execution of multiple
           * calls. The caller should not unbind the service until all ResultReceivers are called.
           *
           * The componentId is the unique name of the component as returned by
           * ComponentInstallerPolicy#getHash.
           *
           * On success, the resultReceiver will be called with a return code of zero and the resultData
           * Bundle will contain a HashMap that maps file paths (relative to their component directory) to
           * an open ParcelFileDescriptor. The caller is responsible for closing these file descriptors.
           * The result map can be retrieved by calling
           * resultData.getSerializable(ComponentsProviderService.KEY_RESULT) and casting the result to a
           * (HashMap<String, ParcelFileDescriptor>).
           * On failure, a non-zero result code is sent with a null Bundle.
           *
           * @param componentId the component for which to retrieve files
           * @param resultReceiver a callback to receive the result
           */
      @Override public void getFilesForComponent(java.lang.String componentId, android.os.ResultReceiver resultReceiver) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(componentId);
          if ((resultReceiver!=null)) {
            _data.writeInt(1);
            resultReceiver.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFilesForComponent, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getFilesForComponent(componentId, resultReceiver);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.components.component_updater.IComponentsProviderService sDefaultImpl;
    }
    static final int TRANSACTION_getFilesForComponent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.components.component_updater.IComponentsProviderService impl) {
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
    public static org.chromium.components.component_updater.IComponentsProviderService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Request files for a component. The caller should expect that files may be missing and should
       * handle that.
       *
       * This is an asynchronous call and there is no guarantee on the order of execution of multiple
       * calls. The caller should not unbind the service until all ResultReceivers are called.
       *
       * The componentId is the unique name of the component as returned by
       * ComponentInstallerPolicy#getHash.
       *
       * On success, the resultReceiver will be called with a return code of zero and the resultData
       * Bundle will contain a HashMap that maps file paths (relative to their component directory) to
       * an open ParcelFileDescriptor. The caller is responsible for closing these file descriptors.
       * The result map can be retrieved by calling
       * resultData.getSerializable(ComponentsProviderService.KEY_RESULT) and casting the result to a
       * (HashMap<String, ParcelFileDescriptor>).
       * On failure, a non-zero result code is sent with a null Bundle.
       *
       * @param componentId the component for which to retrieve files
       * @param resultReceiver a callback to receive the result
       */
  public void getFilesForComponent(java.lang.String componentId, android.os.ResultReceiver resultReceiver) throws android.os.RemoteException;
}
