/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: ../../android_webview/java/src/org/chromium/android_webview/services/IVariationsSeedServer.aidl
 */
package org.chromium.android_webview.services;
public interface IVariationsSeedServer extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.chromium.android_webview.services.IVariationsSeedServer
{
private static final java.lang.String DESCRIPTOR = "org.chromium.android_webview.services.IVariationsSeedServer";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.chromium.android_webview.services.IVariationsSeedServer interface,
 * generating a proxy if needed.
 */
public static org.chromium.android_webview.services.IVariationsSeedServer asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.chromium.android_webview.services.IVariationsSeedServer))) {
return ((org.chromium.android_webview.services.IVariationsSeedServer)iin);
}
return new org.chromium.android_webview.services.IVariationsSeedServer.Stub.Proxy(obj);
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
case TRANSACTION_getSeed:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelFileDescriptor _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
this.getSeed(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.chromium.android_webview.services.IVariationsSeedServer
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
// oldSeedDate, the service will write it to newSeedFile.

@Override public void getSeed(android.os.ParcelFileDescriptor newSeedFile, long oldSeedDate) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getSeed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getSeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
// Apps request variations seeds from WebView's service by calling this interface. They should
// pass the "date" field of their current seed as oldSeedDate (in milliseconds since epoch), or
// Long.MIN_VALUE to indicate they have no seed. If the service's latest seed is newer than
// oldSeedDate, the service will write it to newSeedFile.

public void getSeed(android.os.ParcelFileDescriptor newSeedFile, long oldSeedDate) throws android.os.RemoteException;
}
