package com.phase3.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/uploadfileindex")
public class UploadFileIndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(Map model) {
		return "uploadfileindex";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(BindingResult result) {
		return "uploadfileindex";
	}
}
