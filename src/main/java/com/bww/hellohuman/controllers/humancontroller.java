package com.bww.hellohuman.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class humancontroller {
	@RequestMapping("/")
	public String human() {
		return "Hello Human! Welcome to SpringBoot!";
	}
	@RequestMapping("/{firstname}/{lastname}")
	public String name(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
		return "Hello " + firstname + " " + lastname + "! Welcome to SpringBoot";
	}
	
}
