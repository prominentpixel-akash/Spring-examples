package com.prominentpixel.xml.controller;

import com.prominentpixel.xml.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/xmldemo")
    public Test testDemo() {
        Test test = new Test();
        test.setId(1);
        test.setName("Akash");
        return test;
    }
}
