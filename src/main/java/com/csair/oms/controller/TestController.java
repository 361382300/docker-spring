package com.csair.oms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
import java.util.UUID;

@Slf4j
@Controller
public class TestController {

    @RequestMapping("/ok")
    @ResponseBody
    public String index(String data) {
        System.out.println(data);
        return data;
    }

    @RequestMapping("/okk")
    @ResponseBody
    public String index2() {
        log.info("uuid:  {}", UUID.randomUUID().toString());
        return "data";
    }

}
