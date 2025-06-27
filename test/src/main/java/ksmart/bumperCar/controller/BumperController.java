package ksmart.bumperCar.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BumperController {

	@GetMapping("/main")
	public String mainView() {
		
		return "/main";
	}
	
}
