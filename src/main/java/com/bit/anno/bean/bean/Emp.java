package com.bit.anno.bean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.Data;

@Configuration
@Data
public class Emp {
	@Bean(name="emp")
	public Emp emp() {
		return new Emp();
	}
	public Emp () {
		System.out.println("Emp 생성자");
	}
	private String empNo;
	private String empName;
	
	
	
}
