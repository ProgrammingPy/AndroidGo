package com.example.ekin.samplejni;

public class SampleJni {

    static {
        System.loadLibrary("sample");
    }

    public static native String stringFromJNI();
}
