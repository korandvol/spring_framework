package ua.lviv.lgs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

	@GetMapping ("/test")
	public String test() {
		return new String("test");
	}
}
