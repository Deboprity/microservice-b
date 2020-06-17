package com.example.microserviceb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceBController {
	
	@RequestMapping("/api/v2/getCustomers")
	public String getCustomers() {
		return "success";
	}
}
