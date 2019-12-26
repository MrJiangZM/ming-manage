package com.ming.blog.controller.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Jiang Zaiming
 * @date 2019/12/19 2:39 下午
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/login")
    @CrossOrigin
    public Object login(@RequestBody(required = false) Map<String, String> paramMap) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 20000);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("token", "admin");
        resultMap.put("data", dataMap);
        log.info("login aaaa");
        return resultMap;
    }

    @GetMapping("/info")
    @CrossOrigin
    public Object userInfo() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 20000);
        Map<String, Object> dataMap = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("admin");
        List<String> list2 = new ArrayList<>();
        list2.add("admin");
        dataMap.put("roles", list1);
        dataMap.put("role", "list2");
        dataMap.put("name", "admin");
        dataMap.put("avatar", "admin");
        resultMap.put("data", dataMap);
        log.info("info aaaa");
        return resultMap;
    }

}
