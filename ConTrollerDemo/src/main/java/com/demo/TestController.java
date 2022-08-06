package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = "/login")
public class TestController {
    @RequestMapping(value = "/")
    public String Treturn() {
        return "index";
    }
    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }

    //@GetMapping get请求
    //@PostMapping post 请求
    //@PutMapping
    //@DeleteMapping
    public String getMs(){
        return "";
    }
    @RequestMapping(
            value = "/testParams",
            params = {"username=admin","password=123"}
    )
    public String testParams(){
        return "target";
    }
}
