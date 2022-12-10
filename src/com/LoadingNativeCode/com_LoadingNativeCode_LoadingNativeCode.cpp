#include "com_LoadingNativeCode_LoadingNativeCode.h"
#include <iostream>

JNIEXPORT int JNICALL Java_com_LoadingNativeCode_LoadingNativeCode_sayHello
  (JNIEnv* env, jobject thisObject) {
    printf("Hello JNI\n");
    return 10;
}