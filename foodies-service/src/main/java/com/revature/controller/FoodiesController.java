package com.revature.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class FoodiesController {
	
	@GetMapping(path = "")
	public String getFood() {
		return "There is no food, despondant FAAILUURE!";
	}
}
