package com.hhfactory.alfred.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController {

	
	@RequestMapping(value="/callback",method=RequestMethod.POST)
	public String callBack(HttpServletRequest request) {
		return "hello";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String hello(){
		return "hello,world";
	}
}
