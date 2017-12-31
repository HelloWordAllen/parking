package com.parking.controller;

import com.parking.common.Result;
import com.parking.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wpg on 2017/12/31.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/all")
    @ResponseBody
    public Result getAllTest(){
        System.out.println("enter----");
        return testService.getAllTest();
    }
}
