package com.yfshi.crm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeeController {

    @RequestMapping("/login")
    @ResponseBody
    public Map login(String username, String password){
        Map<String,Object> result = new HashMap<>();

    }





}
