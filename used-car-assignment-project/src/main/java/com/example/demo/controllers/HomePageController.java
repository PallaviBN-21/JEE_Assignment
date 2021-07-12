package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value="/")
	public String init(Model model) {
		model.addAttribute("heading","Welcome to Used Car Service");
		return "index";
	}
}
