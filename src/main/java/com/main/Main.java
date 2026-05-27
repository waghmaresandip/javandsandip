package com.main;

import java.util.ArrayList;
import java.util.List;

import com.stu.StudentNotFoundException;
import com.tushar.Student;

import cm.controller.Controller;

public class Main {
	
	public static void main(String[] args)
	{
		Controller c1=new Controller();
		/*Student student=new Student(1,"rajesh",80.80);
		String srt=c1.insertb(student);
		System.out.println(srt);*/
	/*ArrayList<Student> al=new ArrayList<Student>();
	Student s1=new Student(5,"sunil",90.90);
	Student s2=new Student(6,"sarika",80.80);
	Student s3=new Student(7,"rahul",70.70);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	 String str=c1.insertMul(al);
	 System.out.println(str);*/
		/*Student s1=c1.getBy(3);
		System.out.println(s1);*/
		/*List<Student> d1=c1.get();
		for(Student fe:d1)
		{
			System.out.println(fe);
		}*/
		
		
		/* String str=c1.updaStudent();
		 System.out.println(str);*/
		try
		{
		String str= c1.delBy();
		System.out.println(str);
		}
		catch(StudentNotFoundException e)
		{
			e.getMessage();
		}
		
		 
	}
	
}
