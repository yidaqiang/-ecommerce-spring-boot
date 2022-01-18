package com.baeldung.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Vista Yih
 * @Version 0.1.0
 * <p>
 * Created on 2021-11-10
 * Package  in spring-boot-ecommerce
 */
@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return "Welcome to ecommerce!";
    }
}
