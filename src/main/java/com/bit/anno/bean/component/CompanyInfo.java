package com.bit.anno.bean.component;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
//@Configuration
public class CompanyInfo {
	
//	@Autowired
	private Emp emp;
	private Dept dept;
	
//	@Bean(name="getCompany", autowire = Autowire.BY_NAME)
	public CompanyInfo getCompanyInfo() {
		return new CompanyInfo();
	}
	
	
}
