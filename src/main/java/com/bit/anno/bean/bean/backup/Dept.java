package com.bit.anno.bean.bean.backup;

import lombok.Data;

@Data
public class Dept {
	public Dept() {
		System.out.println("dept 생성자");
	}
	private String deptNo;
	private String deptName;
}
