package com.kgfsl.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "datafavorite")
public class DataFavoriteController {

	@RequestMapping(value = "/")
	public String index(Model model) {
		String message = "Welcome to data favorite..!";
		model.addAttribute("message", message);
		return "/datafavorite/index";
	}
}
