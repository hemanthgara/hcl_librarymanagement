package com.library.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
w


	@GetMapping("/Login")
	public String getRequest() {
		System.out.println("returning call from Login user....");
		return "login";
	}

	@GetMapping("/")
	public String others() {
		return searchDetails();
	}
}
