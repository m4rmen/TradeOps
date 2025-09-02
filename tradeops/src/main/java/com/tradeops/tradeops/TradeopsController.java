package com.tradeops.tradeops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TradeopsController {


    @GetMapping("/")
    public String Hello() {
        return "Hello from TradeOps";
    }
    

}



