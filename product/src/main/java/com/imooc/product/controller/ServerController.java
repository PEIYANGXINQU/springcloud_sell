package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hellozjf
 * @date 2018/4/18 23:04
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    private String msg() {
        return "this is product's msg 1";
    }
}
