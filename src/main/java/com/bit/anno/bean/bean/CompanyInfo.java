package com.bit.anno.bean.bean;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Configuration
@Data
public class CompanyInfo {
	@Autowired
	private Emp emp ;
	private Dept dept;
	@Bean(name="company")
	public CompanyInfo companyInfo() {
		return new CompanyInfo();
	}
	public CompanyInfo() { 
		System.out.println("companyInfo 생성자");
	}
	public CompanyInfo(Emp emp) {
		System.out.println("companyInfo Emp파라미터 생성자");
	}
	
	
	
}
