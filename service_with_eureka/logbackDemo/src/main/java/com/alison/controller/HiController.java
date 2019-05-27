package com.alison.controller;

import com.alison.DemoApplication;
import com.alison.service.HiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author huangyong
 * @Date 2019/5/27
 **/
@RestController
public class HiController {
    private static final Logger logger = LoggerFactory.getLogger(HiController.class);

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String hi() {
        logger.info("HiController-------GLMAPPER-SERVICE:info");
        logger.error("HiController-------GLMAPPER-SERVICE:error");
        hiService.hi();
        return "hi";
    }
}
