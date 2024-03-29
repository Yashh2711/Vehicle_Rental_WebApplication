package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CredentialsRequestDto {
	
	@NotBlank(message = "Should enter email")
	@Email(message = "Invalid email format")
	private String email;
	
	@NotBlank(message = "Should enter password")
	@Length(min = 5,max=20,message = "Should enter strong password")
	private String password;
}
