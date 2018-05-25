package com.tens.spring.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "/home";

    }

}
