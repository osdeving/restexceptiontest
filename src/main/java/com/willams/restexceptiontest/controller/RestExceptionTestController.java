package com.willams.restexceptiontest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willams.restexceptiontest.dto.SomeRequestDTO;
import com.willams.restexceptiontest.service.SomeService;

@RestController
@RequestMapping("/persistence")
public class RestExceptionTestController {
	@Autowired
	private SomeService service;
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody SomeRequestDTO request) {
		return new ResponseEntity<>(service.process(request), HttpStatus.OK);
	}
}
