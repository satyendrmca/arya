package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/test")
	public String testController()
	{
		return "This is test for migration with jenkin ";
		
	}
}
