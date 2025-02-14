package com.turkcell.customerservice.controller;

import com.turkcell.common.utility.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @GetMapping("test")
    public void test(){
        StringUtil.test();
    }
}
