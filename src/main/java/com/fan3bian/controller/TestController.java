package com.fan3bian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蔡敏健
 * @date 2024-01-16
 */
@Controller()
@RequestMapping("/test/")
public class TestController {

    @GetMapping("/diffConfig1")
    public Object diffConfig() {
        return "diffConfig";
    }


}
