package com.sathya.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("search-api")
public class Search_ServiceController {
	
	@GetMapping("/search")
	public ResponseEntity<String> searchService(){
		return new ResponseEntity<String>("welcomr to filpcart service .com ",HttpStatus.OK);
	}

}
