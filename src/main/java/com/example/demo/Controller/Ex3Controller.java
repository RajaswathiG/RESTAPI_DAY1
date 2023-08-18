package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3Controller {
	@Value("${fav}")
	private String color;
@GetMapping("/get")
public String getMyFav()
{
	return "My favorite color is "+color;
}
}

