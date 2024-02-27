package com.example.main.test;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ltl")
@CrossOrigin(origins = "http://localhost:3000")
public class jsonController {

    @RequestMapping("/students")
    public  JSONObject jsonTest(){

        User user1 = new User(1,"小明","123456xm");
        User user2 = new User(2,"小红","123456xh");
        User user3 = new User(3,"小李","123456xl");
        List list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("user",list);

        System.out.println(jsonObject2);

        return jsonObject2;
    }

}

