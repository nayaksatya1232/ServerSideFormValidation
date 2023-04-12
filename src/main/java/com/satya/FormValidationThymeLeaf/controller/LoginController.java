package com.satya.FormValidationThymeLeaf.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.satya.FormValidationThymeLeaf.entity.UserCredential;

@Controller
public class LoginController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("user",new UserCredential());
		return "login";
	}
	@PostMapping("/check")
	public String check(@Valid @ModelAttribute("user") UserCredential user,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "login";
		}
		System.out.println(user);
		return "home";
	}
}
