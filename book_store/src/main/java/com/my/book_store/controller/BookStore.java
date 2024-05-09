package com.my.book_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookStore {
    @GetMapping("/")
    public String loadHome() {
        return "Home";
    }

    @GetMapping("/#signin")
    public String loadLogin() {
        return "Signin";
    }

}
