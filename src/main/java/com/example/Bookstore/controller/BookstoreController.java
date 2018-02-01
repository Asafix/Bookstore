package com.example.Bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class BookstoreController {
	@RequestMapping(value="/index")
	public String bookList (Model model) {
		model.addAttribute("Books");
		return "";
	}
}
