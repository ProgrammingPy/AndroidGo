//
// Created by ekin on 18-5-16.
//
#include <iostream>
#include <string>
#include "com_example_ekin_samplejni_SampleJni.h"

/*
 * Class:     com_example_ekin_samplejni_SampleJni
 * Method:    stringFromJNI
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_ekin_samplejni_SampleJni_stringFromJNI
  (JNIEnv *env, jclass obj)
{
    return env->NewStringUTF("Compiled with ABI ");
}
