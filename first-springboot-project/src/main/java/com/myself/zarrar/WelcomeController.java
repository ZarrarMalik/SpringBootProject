package com.myself.zarrar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	//dependency
	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/welcome")                  //mapping url
	public String welcome() {
		return service.retreiveWelcomeMessage();
		
	}
	
	

	
}
