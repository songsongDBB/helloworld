package com.dss.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/sayHello")
	public String sayHello() {
		return "张楚霞说：hello world";
	}
	
	@GetMapping(value = "sayHi")
	public String sayHi() {
		return "suansongsong say : Hi World";
	}
}
