package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@Slf4j
public class UserController {

    //PathVariable 获取url中的数据   比如:localhost:8080/hello/id 获取id值
    //@RequestParam 获取请求参数的值  localhost:8080/hello?id=1000
    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @Autowired
    Environment environment;

    @GetMapping("/userInfo1")
    @ResponseBody
    public User getUserInfo1() {
        log.info(environment.getProperty("sprint.current.application.name"));
        log.info(environment.getProperty("spring.env.name"));
        log.info(user.toString());
        return user;
    }

    @GetMapping("/userInfo")
    public User getUserInfo() {
        return userService.getUserInfo("test");
    }

    @RequestMapping(value="/userMap/{loginName}", method= RequestMethod.GET)
    public User getUserMap(@PathVariable("loginName") String loginName) {
        log.info("请求userMap");
        return userService.getUserMap(loginName);
    }

    @GetMapping("/userMap1")
    public User getUserMap1(@RequestParam("loginName") String loginName) {
        return userService.getUserMap(loginName);
    }

}
