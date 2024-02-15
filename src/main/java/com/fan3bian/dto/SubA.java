package com.fan3bian.dto;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshuyi
 * @description
 * @create 2024/1/29 16:47
 */
public class SubA extends A{

    @Override
    public ArrayList getA() {
        return null;
    }

    public static void main(String[] args) {
        Class<SubA> subAClass = SubA.class;
        Method[] declaredMethods = subAClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
