package com.dss.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/sayHello")
	public String sayHello() {
		return "hello world";
	}
	
	@GetMapping(value = "sayHi")
	public String sayHi() {
		return "Hi World";
	}
}
