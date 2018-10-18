package com.pro.web.api;

import javafx.scene.chart.ValueAxis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "nihao";
    }
}
