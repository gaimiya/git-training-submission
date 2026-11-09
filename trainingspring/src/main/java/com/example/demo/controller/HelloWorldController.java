package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
}
