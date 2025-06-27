package ksmart.admin.adminpage.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminPageController {
	@GetMapping("/")
	public String Mainview() {
		
		return "/mainView";
	}
}
