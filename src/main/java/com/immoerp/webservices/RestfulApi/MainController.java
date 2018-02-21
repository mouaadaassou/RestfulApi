package com.immoerp.webservices.RestfulApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.immoerp.webservices.RestfulApi.domain.HelloBean;

@RestController
@RequestMapping("/")
public class MainController {

	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home() {
		return "hello from the Home Controller";
	}
	
	@GetMapping(path = "/home-bean")
	public HelloBean helloBean() {
		return new HelloBean("Hello From HelloBean");
	}
	
	@GetMapping(path = "/hello/{from}")
	public HelloBean helloFrom(@PathVariable String from) {
		return new HelloBean(String.format("Hello from %s", from));
	}
}
