package com.demo.FirstBootProject.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
	
	@NotNull(message="Employee can not be null")
	private String name;
	@Email(message="Invalid Email address")
	private String email;
	@Min(1000)
    @Max(500000)
	private Float salary;
	 @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mobileNo;

}
