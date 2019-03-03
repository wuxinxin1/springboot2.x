package com.example.controller;

import com.example.module.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试http请求的GET请求,使用restful风格
 * Created by Administrator on 2019/3/3/003.
 */
@RestController
public class GetController {

    Map<String,String >  users=new HashMap<>();

    /**
     * 使用rest风格，使用路径值作为参数
     * @param cityId
     * @param userId
     * @return
     */
    @RequestMapping(value = "/{city_id}/{user_id}",method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id") String cityId,@PathVariable("user_id") String userId){
        users.put("cityId",cityId);
        users.put("userId",userId);
        return users;
    }

    /**
     * 不需要指定请求方法
     */
    @GetMapping("/v1/{city_id}/{user_id}")
    public Object findUser1(@PathVariable("city_id") String cityId,@PathVariable("user_id") String userId){
        users.put("cityId",cityId);
        users.put("userId",userId);
        return users;
    }

    /**
     * 不需要指定请求方法,使用默认值
     */
    @GetMapping("/v2")
    public Object findUser2(@RequestParam(name = "city_id",defaultValue = "1") String cityId ,
                            @RequestParam(name = "user_id",defaultValue = "1") String userId){
        users.put("cityId",cityId);
        users.put("userId",userId);
        return users;
    }

    /**
     * 使用json交互,请求对象
     */
    @RequestMapping("/v3")
    public Object findUser3(@RequestBody User user){
        users.put("name",user.getName());
        users.put("age",String.valueOf(user.getAge()));
        users.put("phone",user.getPhone());
        return users;
    }

    /**
     * 获取到头信息
     */
    @RequestMapping("/v4")
    public Object findUser4(@RequestHeader(name = "aa") String aa){
        users.put("aa",aa);
        return users;
    }
}
