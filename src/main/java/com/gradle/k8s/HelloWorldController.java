package com.gradle.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello This is Gradle Project - v1";
	}

}
