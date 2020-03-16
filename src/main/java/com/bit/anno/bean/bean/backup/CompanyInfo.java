package com.bit.anno.bean.bean.backup;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CompanyInfo {
	
	@Bean(name="company")
	public CompanyInfo companyInfo() {
		return new CompanyInfo();
	}
	
	private Emp emp ;
	private Dept dept;
	public CompanyInfo() { }
	
	//@Autowired(required = false)
	public CompanyInfo(Emp emp) {
		System.out.println("companyInfo 생성자");
	}
	
	public void yes() {
		System.out.println("companyInfo yes()  Emp : "+emp);
	}
	public Emp getEmp() {
		return emp;
	}
	
//	@Autowired(required = false)
//	@Resource
	public void setEmp(Emp emp) {
		System.out.println("setEmp");
		this.emp = emp;
	}
	public Dept getDept() {
		return dept;
	}
	
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "CompanyInfo [emp=" + emp + ", dept=" + dept + "]";
	}
	
	
	
}
