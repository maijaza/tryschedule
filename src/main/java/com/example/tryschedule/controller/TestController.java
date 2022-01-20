package com.example.tryschedule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tryschedule.constant.Data;

@RestController
public class TestController {
	
	@GetMapping("")
    public String index() {
		
    	return "Hello world " + Data.cnt;
    }

}
