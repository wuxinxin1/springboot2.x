package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/3/9/009.
 */
@Controller
public class TemplateController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
