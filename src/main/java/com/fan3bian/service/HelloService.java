package com.fan3bian.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuyi
 * @description
 * @create 2024/1/10 21:54
 */
@Service
public class HelloService {

    @Value("${ordinaryDeliveryTaskSubTypeCode}")
    private int ordinaryDeliveryTaskSubTypeCode = 2232;
}
