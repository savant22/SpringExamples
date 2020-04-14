package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@SpringBootApplication
public class JpaRestApplication implements CommandLineRunner{

	@Autowired
	StudentDaoI studao;
	public static void main(String[] args) {
		SpringApplication.run(JpaRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Student s=new Student(1,"sachin","cs");
		Student s1=new Student(2,"dfgh","bn");
		Student s2=new Student(3,"suchin","cs");
		
		studao.create(s);
		studao.create(s1);
		studao.create(s2);
		
		System.out.println("record inserted");*/
		
		/*List <Student> list=studao.retrieve();
		
		for(Student stu:list)
		{
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getDept());
		}*/
		
		/*Student stu=studao.findById(2);
		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getDept());*/
		
		//studao.delete(2);
		
		//studao.update(3);
	}

}
