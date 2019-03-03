package com.example.controller;

import com.example.module.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/3/003.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/test")
    public Map<String ,String > test() {
        Map<String,String > hashMap=new HashMap<>();
        hashMap.put("aa","111");
        return hashMap;
    }

    /**
     * 对json的一些注解进行使用
     * @JsonIgnore 不返回这个字段
     * @JsonProperty("account") 修改字段名称
     * @JsonInclude(JsonInclude.Include.NON_NULL)  null时返回
     * @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss") 指定时间格式
     * @return
     */
    @RequestMapping("/testjson")
    public Object testjson() {
        //return new User("111",12,"123444");
        return new User("111",12,"123444",new Date());
    }


}
