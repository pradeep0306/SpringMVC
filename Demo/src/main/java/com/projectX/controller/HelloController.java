package com.projectX.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectX.beans.ResponseJsonBean;

//import com.projectX.beans.Quote;

 

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloMessage()
	{
		String message = "Welcome to Spring Demo 1";
		return new ModelAndView("hellopage","message", message);
	}
	@RequestMapping("/Service")
	public ModelAndView getData()
	{
		String uri = "http://gturnquist-quoters.cfapps.io/api/random";
	    RestTemplate restTemplate = new RestTemplate();
	    ResponseJsonBean result = restTemplate.getForObject(uri, ResponseJsonBean.class);
	    ObjectMapper mapper = new ObjectMapper();
	    try {
			return new ModelAndView("userpage","result", mapper.writeValueAsString(result));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return new ModelAndView("userpage","result", e.getMessage());
		}
	}
}
