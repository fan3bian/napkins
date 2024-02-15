
package com.fan3bian.service;

public class TestClass {
    public String testMethod() {
        return "Called with: empty";
    }
    public String testMethod1(String arg1) {
        return "Called with: " + arg1 ;
    }
    public String testMethod2(String arg1, Integer arg2) {
        return "Called with: " + arg1 + ", " + arg2;
    }
}