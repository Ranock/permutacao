package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tester;
import com.example.demo.repository.TesteMongoImpl;

@RestController
@RequestMapping("/")
public class testeController {

	@Autowired
	TesteMongoImpl t;	
	
	@RequestMapping("/a")
	public List<Tester> retrieve(){
		return t.retrieve();
	}
}
