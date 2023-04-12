package com.satya.FormValidationThymeLeaf.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserCredential {
	@NotBlank(message = "Email Can't be Empty...")
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message = "Invalid Email")
	private String email;
	@NotBlank(message = "Password Can't be Empty...")
	@Size(min=5,message="Password Must be of atleast 5 characters length..")
	@Size(max=8,message="Maximum 8 characters Allowed..")
	private String password;
	@AssertTrue(message = "Please Confirm...")
	private boolean agreed;

	public UserCredential() {

	}
}
