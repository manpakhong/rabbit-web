package com.rabbitforever.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class CommonController {
	private final Logger logger = LogManager.getLogger(getClassName());


	private String getClassName() {
		return this.getClass().getName();
	}
	
	public CommonController() {
		try {
			init();
		} catch (Exception e) {
			logger.error(getClassName() + ".CommonController() ", e);
		}
	}
	private void init() throws Exception {

	}
	
	@GetMapping("/setSession")
	public String setSession(Model model, HttpServletRequest request) {
		try {
			model.addAttribute("vo", null);
		} catch (Exception e) {
			logger.error(getClassName() + ".setSession() - model=" + model, e);
		}
		return "common";
	}
	
	@GetMapping("/getSession")
	public String getSession(Model model, HttpServletRequest request) {
		try {
			model.addAttribute("vo", null);
		} catch (Exception e) {
			logger.error(getClassName() + ".getSession() - model=" + model, e);
		}
		return "common";
	}
	
}
