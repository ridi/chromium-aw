/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: ../../android_webview/java/src/org/chromium/android_webview/services/ICrashReceiverService.aidl
 */
package org.chromium.android_webview.services;
public interface ICrashReceiverService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.chromium.android_webview.services.ICrashReceiverService
{
private static final java.lang.String DESCRIPTOR = "org.chromium.android_webview.services.ICrashReceiverService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.chromium.android_webview.services.ICrashReceiverService interface,
 * generating a proxy if needed.
 */
public static org.chromium.android_webview.services.ICrashReceiverService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.chromium.android_webview.services.ICrashReceiverService))) {
return ((org.chromium.android_webview.services.ICrashReceiverService)iin);
}
return new org.chromium.android_webview.services.ICrashReceiverService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_transmitCrashes:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor[] _arg0;
_arg0 = data.createTypedArray(android.os.ParcelFileDescriptor.CREATOR);
java.util.List _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readArrayList(cl);
this.transmitCrashes(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.chromium.android_webview.services.ICrashReceiverService
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
mRemote.transact(Stub.TRANSACTION_transmitCrashes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_transmitCrashes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void transmitCrashes(android.os.ParcelFileDescriptor[] fileDescriptors, java.util.List crashInfo) throws android.os.RemoteException;
}
