package com.javareact.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
