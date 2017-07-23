package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloController {

	@RequestMapping("/index-view-name")
	public String getIndex() {
		return "home";
	}
	
	@RequestMapping("/index-data-name")
	@ResponseBody
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public String getIndex1() {
		return "index data info";
	}
	
	@RequestMapping("/index-data1-name")
	public ResponseEntity<String> getIndex2() {
		
		ResponseEntity<String> response=new ResponseEntity<>("index data response",HttpStatus.OK);
		return response;
	}
}
