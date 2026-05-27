package cm.controller;

import java.util.ArrayList;
import java.util.List;

import com.service.Service;
import com.tushar.Student;

public class Controller {
	Service s1=new Service();
	public String insertb(Student student)
	{
		return s1.inserta(student);
	}
	public String insertMul(ArrayList<Student> student)
	{
	 return s1.insertMult(student);
	}
	public Student getBy(int id)
	{
	Student sp=s1.getByI(id);
	return sp;
	}
	public List<Student> get()
	{
	 List<Student> df=s1.getAl();
	 return df;
	}
	public String updaStudent( )
	{
	 return s1.updatStudent();
	}
	public String delBy()
	{
	return s1.deletById();
	}
}
