package com.willams.restexceptiontest.service;

import com.willams.restexceptiontest.dto.SomeRequestDTO;
import com.willams.restexceptiontest.exceptions.SomeCustomClassException;

public class SomeService {

	public Object process(SomeRequestDTO request) {
		if(request == null) throw new SomeCustomClassException();
		
		return request;
	}

}
