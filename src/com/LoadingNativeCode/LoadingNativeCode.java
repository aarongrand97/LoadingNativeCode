package com.LoadingNativeCode;

public class LoadingNativeCode {

    static {
        //System.setProperty("java.library.path", "C:\\Users\\Aaron\\Documents\\LoadingNativeCode\\src\\com\\LoadingNativeCode");
        System.loadLibrary("native");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hi from java");
        System.out.println("great success");
        LoadingNativeCode h = new LoadingNativeCode();
        System.out.println("before");
        int number = h.sayHello();
        System.out.println(number);

    }

    private native int sayHello();
}
