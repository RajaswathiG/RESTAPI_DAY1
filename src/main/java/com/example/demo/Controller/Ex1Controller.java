package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Ex1Controller {
@GetMapping("/display")
public String welcome()
{
	return "Welcome String Boot!";
}
}

