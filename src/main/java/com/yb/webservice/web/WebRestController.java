package com.yb.webservice.web;

import com.yb.webservice.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/")
	public String hello() {
		return "Hello KaKao Team!!";
	}

	@RequestMapping("/health")
	public Response healthCheck() {
		return new Response("success", "It works well!!");
	}
}
