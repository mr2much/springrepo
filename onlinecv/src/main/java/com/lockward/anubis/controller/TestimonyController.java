package com.lockward.anubis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lockward.anubis.service.TestimonyService;

@Controller
public class TestimonyController {
	@Autowired
	private TestimonyService testimonyService;
	
	@RequestMapping("/")
	public String findAll(Model model) {
		model.addAttribute("testimonies", testimonyService.findAll());
		return "index";
	}
}
