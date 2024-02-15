package com.fan3bian.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@Slf4j
@RestController
@RequestMapping("/devOps")
public class ReflectionController {
    @Data
    public static class Dto {
        private String className;
        private String methodName;
        private Object[] params;
    }

    @PostMapping("/invoke")
    public ResponseEntity<Object> dynamicInvoke(Dto dto) {
        try {
            // 加载类
            Class<?> clazz = Class.forName(dto.getClassName());
            // 获取方法对象
            Method method = null;
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                if (declaredMethod.getName().equals(dto.getMethodName())) {
                    method = declaredMethod;
                    break;
                }
            }
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Object result = method.invoke(instance, dto.getParams());
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            log.error("Error occurred while dynamically invoking the method", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while dynamically invoking the method: " + e.getMessage());
        }
    }
}

