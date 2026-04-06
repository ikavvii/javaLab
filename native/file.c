#include <jni.h>
#include <stdio.h>
#include "NativeDemo.h" // The generated header

JNIEXPORT void JNICALL Java_NativeDemo_sayHello(JNIEnv *env, jobject obj) {
    printf("Hello from Native C code!\n");
}
