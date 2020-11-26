package com.example.azurespringclouddemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMasterController{
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/user")
	public List<UserMaster> getAllUser(){
		List<UserMaster> list = new ArrayList<>();
		list.add(new UserMaster(1, "Vishal"));
		list.add(new UserMaster(2, "Yogesh"));
		list.add(new UserMaster(3, "Vijay"));
		return list;
	}
	
}