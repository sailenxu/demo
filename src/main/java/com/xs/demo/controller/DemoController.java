package com.xs.demo.controller;

import com.xs.demo.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/test")
@RestController
public class DemoController {
    @Resource
    DemoService demoService;

    @GetMapping("/hello")
    public void hello() {
        demoService.getDemo();
    }
}
