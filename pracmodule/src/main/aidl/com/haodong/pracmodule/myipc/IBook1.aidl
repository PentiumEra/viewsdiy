// IBook1.aidl
package com.haodong.pracmodule.myipc;

// Declare any non-default types here with import statements

interface IBook1 {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
}
