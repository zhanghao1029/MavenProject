package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class Test {

	@RequestMapping("/helloword.do")
	public String hello() {
		System.out.println("hello world");
		return "add";
	}
}
