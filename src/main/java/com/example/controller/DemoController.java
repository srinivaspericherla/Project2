package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping(value="/hello1")
	public String sayHello() {
		return "Hello"; 	
	}
}
