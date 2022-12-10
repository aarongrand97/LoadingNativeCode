# LoadingNativeCode
Add -Djava.library.path=C:\Users\Aaron\Documents\LoadingNativeCode\src\com\LoadingNativeCode to the run configuration in intellij

Mostly followed https://www.baeldung.com/jni

Commands to compile and run are:

g++ -c -IC:\Users\Aaron\Documents\LoadingNativeCode\src\com\LoadingNativeCode com_LoadingNativeCode_LoadingNativeCode.cpp -o com_LoadingNativeCode_LoadingNativeCode.o
g++ -shared -o native.dll com_LoadingNativeCode_LoadingNativeCode.o -Wl,--add-stdcall-alias

Expected output is:
Hi from java
great success
before
10
Hello JNI
