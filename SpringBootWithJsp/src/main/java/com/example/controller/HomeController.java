package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Employee;
import com.example.repo.JpaRepo;

@Controller
public class HomeController {

	@Autowired
	private JpaRepo jpaRepo;

	@GetMapping("/get")
	public String getForm() {
		return "add";
	}
	
	@PostMapping("/addForm")
	public String submitForm(@ModelAttribute Employee employee) {
		return "list";
	}
	
	@GetMapping("/getUpdate")
	public String getForm12() {
		return "edit";
	}
	
	@PostMapping("/change")
	public String getUpdate() {
		return "list";
	}

}
