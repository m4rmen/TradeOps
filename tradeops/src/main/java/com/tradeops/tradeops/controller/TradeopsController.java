package com.tradeops.tradeops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class TradeopsController {


    @GetMapping("/")
    public String Hello() {
        System.out.print("Called");
        return "Hello from TradeOps";
    }
    

}



