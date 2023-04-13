package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/main")
	@ResponseBody
	public String index() {
		System.out.println("======== Main Class Called ========");
		return "Hello~ Main Class Called Successs";
	}

	@GetMapping("/")
	public String root() {
		System.out.println("===== Let's Practice SpringBoot =====");
		return "redirect:/question/list";
	}
}
