package ksmart.admin.adminpage.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminPageController {
	/* fuckyou infp_gy */
	@GetMapping("/")
	public String Mainview() {
		
		return "/main";
	}
}
