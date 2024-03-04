package com.ncs.resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ncs.beans.Student;

@Configuration
public class SpringConfigFile {
	
	//@Bean("stdObj1")  //-> We can define different bean name
	@Bean
	public Student stdId1() {
		Student std = new Student();
		
		std.setName("Ram");
		std.setRollNo(111);
		std.setEmail("ram@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj2")  //-> We can define different bean name
	//@Bean
	public Student createStdBeanObj2() {
		Student std = new Student();
		
		std.setName("Vishal");
		std.setRollNo(112);
		std.setEmail("vishal@gmail.com");
		
		return std;
	}


}
