package com.heqing.zipkin.controller;

import com.heqing.zipkin.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/7/16 16:34
 */
@RestController
@RequestMapping("/study")
public class DemoController {

    private  final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    DemoService demoService;

    @GetMapping("/zipkin")
    public String zipkin(){
        return demoService.server("zipkin");
    }
}
