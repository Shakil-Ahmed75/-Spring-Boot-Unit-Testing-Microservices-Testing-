package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page") int pageno, @RequestParam(value="limit")int limitno) {
		
		return "Http Get Request was sent for page: "+ pageno + "and limit is:" +limitno;
	}
	
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String userID) {
		return "Http Get Request was sent for userid:" +userID;
	}
	
	@PostMapping
	public String createUsers() {
		
		return " Http Post Request was sent";		
	}
	
	@PutMapping
	public String UpdateUsers() {
		
		return "Http Update Request  was sent";	
	}
	
	@DeleteMapping
	public String deleteMapping() {
		
		return "Http Delete  was sent";
	}

}
