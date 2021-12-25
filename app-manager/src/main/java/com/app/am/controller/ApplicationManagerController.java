package com.app.am.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//	http://localhost:8080/app/getMessage

@RestController
@RequestMapping(path = "/app")
public class ApplicationManagerController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Success";
	}

}
