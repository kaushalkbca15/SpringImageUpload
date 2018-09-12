package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UploadImageController {

	@GetMapping("home")
	public String home() {
		return "home";
	}
	@PostMapping("upload")
	public String upload() {
		return "home";
	}
}
