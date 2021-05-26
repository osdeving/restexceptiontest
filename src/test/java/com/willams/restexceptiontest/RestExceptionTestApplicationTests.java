package com.willams.restexceptiontest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.willams.restexceptiontest.service.SomeService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class RestExceptionTestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SomeService helloService;

	@Test
	public void testException() throws Exception {
		mockMvc.perform(post("/").accept(org.springframework.http.MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string("Hello"));
	}

}
