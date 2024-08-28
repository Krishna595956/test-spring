package com.example.sample.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import java.util.List;


@Controller
public class SampleController {

	
	
	@GetMapping("/")
	public String hello() {
		return "dashboard";
	}
	
	@GetMapping("/addtask")
	public String addtask() {
		return "addtask";
	}
	

	

}
	
	
	
	