package br.com.netflixclone.myapimovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

	
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Hello Mundo, minha api movies";
	}
}
