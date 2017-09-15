package com.boyer.challenge1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/greeting")
	public String homePage(Model model) {
		return "index";
	}
}
