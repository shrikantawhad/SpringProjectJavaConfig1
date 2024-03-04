package com.ncs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ncs.beans.Student;
import com.ncs.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		//Student std = (Student) context.getBean("stdId1");
		//Student std = context.getBean(Student.class);
		
		Student std = (Student) context.getBean("stdId1");  // Providing userdefined bean name "stdObj"
		std.display();
		
		System.out.println("********************************");
		
		Student std2 = (Student) context.getBean("stdObj2");  // Providing userdefined bean name "stdObj"
		std2.display();
		
		
		
	
	}
	
}
