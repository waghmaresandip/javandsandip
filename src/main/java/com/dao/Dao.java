package com.dao;

import java.util.ArrayList;
import java.util.List;


import com.stu.StudentNotFoundException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dbconnection.HibernateConfiguration;
import com.tushar.Student;

public class Dao {
	public String insert(Student student)
	{
		Session session=HibernateConfiguration.hiberConnection();
		Transaction tx=session.beginTransaction();
		Student s1=new Student(1,"rahul",90.90);
		session.save(s1);
		tx.commit();
		session.close();
		return "inserted succsesfully";
	}
	public String insertMulti(ArrayList<Student> students)
	{
		Session session=HibernateConfiguration.hiberConnection();
		Transaction tx=session.beginTransaction();
		
		for(Student st:students)
		{
		session.save(st);
		}
		tx.commit();
		session.close();
		
		return "Inserted multiple succsesfully";
	}
	public Student getById(int id)
	{
		Session session=HibernateConfiguration.hiberConnection();
		Student student=session.get(Student.class,7);
		if(student==null)
		{
			throw new StudentNotFoundException("msg");
		}
		else
		{
			session.close();
			return student;
		}
	}
		public List<Student> getAll()
		{
			
			Session session=HibernateConfiguration.hiberConnection();
			List<Student> students=session.createQuery("from Student").list();
			
			return students;
		}
		public String updateStudent()
		{
			Session session=HibernateConfiguration.hiberConnection();
			Transaction tx=session.beginTransaction();
			Student student=session.get(Student.class,20);
			if(student==null)
			{
				
				throw new StudentNotFoundException("student not found ");
			}
			else
			{
				student.setName("RAMPRABHU");
				student.setMarks(13.00);
				session.update(student);
				tx.commit();
				session.close();
				return "UPDATED SUCCSESFULLY";
			}
			
			
		}
		public String  deleteById()
		{
			Session session=HibernateConfiguration.hiberConnection();
			Transaction tx=session.beginTransaction();
			Student s1=session.get(Student.class, 9);
			if(s1==null)
			{
				throw new StudentNotFoundException("student not found");
			}
			else
			{
				session.delete(s1);
				tx.commit();
				session.close();
			return "DELETED SUCCSESFULLY";
			}
		}
		
		
		
	}
	
	


