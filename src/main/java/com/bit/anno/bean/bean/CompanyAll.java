package com.bit.anno.bean.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { Emp.class,CompanyInfo.class })
public class CompanyAll {

}
