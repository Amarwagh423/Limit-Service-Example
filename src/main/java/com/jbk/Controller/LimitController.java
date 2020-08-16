package com.jbk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Configuration.limitConfigure;

@RestController
public class LimitController {

	@Autowired
	limitConfigure lim;
	
	@GetMapping("/limits")
	public limitConfigure retrivelimit() {
		return new limitConfigure(lim.getMax(),lim.getMin());
	}
	
	
	
}
