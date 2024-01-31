package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		System.out.println("home page");
		return "home";
	}
	
	@GetMapping("/name")
	public String name() {
		return "name";
	}

}
