package com.alison.service;

import com.alison.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author huangyong
 * @Date 2019/5/27
 **/

@Service
public class HiService {
    private static final Logger logger = LoggerFactory.getLogger(HiService.class);

    public String hi(){
        logger.info("HiService-------GLMAPPER-SERVICE:info");
        logger.error("HiService-------GLMAPPER-SERVICE:error");
        return "hi";
    }


}
