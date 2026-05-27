package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.stu.StudentNotFoundException;
import com.tushar.Student;

public class Service {
	Dao d1=new Dao();
	public String inserta(Student student)
	{
		return d1.insert(student);
	}
	public String insertMult(ArrayList<Student> student)
	{
	return d1.insertMulti(student);
	
	}
	public Student getByI(int id)
	{
		Student s1=null;
		try
		{
		s1=d1.getById(id);
		System.out.println("found"+s1.getName());
		}
		catch(StudentNotFoundException r)
		{
			r.getMessage();
		}
	
	return s1;
	
	
	
	}
	public List<Student> getAl()
	{
	List<Student> se=d1.getAll();
	return se;
	}
	public String updatStudent()
	{
		String str=null;
		try
		{
	  str= d1.updateStudent();
	  System.out.println("found");
		}
		catch(StudentNotFoundException u)
		{
			u.getMessage();
		}
		return str;
		
	}
	public String deletById()
	{
		return d1.deleteById();
	}
	}
	 
