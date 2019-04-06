package com.lockward.anubis.controller;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import com.lockward.anubis.service.TestimonyService;

@Controller
public class TestimonyController implements IGTVGController {
	@RequestMapping("/")
	public String findAll(Model model) {
		model.addAttribute("testimonies", TestimonyStub.findAll());
		return "index";
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext,
			TemplateEngine templateEngine) throws IOException {
		WebContext ctx = new WebContext(request, response, servletContext, new Locale("en_US"));
		templateEngine.process("index", ctx, response.getWriter());
	}
}
