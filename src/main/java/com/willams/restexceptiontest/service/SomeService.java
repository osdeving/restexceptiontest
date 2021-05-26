package com.willams.restexceptiontest.service;

import org.springframework.stereotype.Service;

import com.willams.restexceptiontest.dto.SomeRequestDTO;
import com.willams.restexceptiontest.exceptions.SomeCustomClassException;

@Service
public class SomeService {

	public Object process(SomeRequestDTO request) {
		if(request.getNome().equals("willams") == false) throw new SomeCustomClassException();
		
		return request;
	}

}
