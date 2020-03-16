package com.bit.anno.use.backup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.anno.bean.bean.CompanyAll;
import com.bit.anno.bean.bean.CompanyInfo;
import com.bit.anno.bean.bean.Emp;


public class AnnoMainTestComponent {
	
	public static void main(String[] args) {
		System.out.println("Container  생성 전 ");
		//ApplicationContext context = new ClassPathXmlApplicationContext("servlet-context.xml");
		ApplicationContext context =  new AnnotationConfigApplicationContext(CompanyInfo.class,Emp.class);
		System.out.println("Container  생성 후  Bean 생성전 ");
		
		CompanyInfo info = (CompanyInfo) context.getBean("company");
		System.out.println("Bean 생성 후  ");
		
		info.setEmp(  (Emp)context.getBean("emp"));
		//info.yes(); // 출력용 메소드 yes()
	}
}
