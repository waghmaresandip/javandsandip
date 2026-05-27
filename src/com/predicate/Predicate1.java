package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args)
	{
	/*Predicate<Integer> p1=(i)->i>10;
	boolean b=p1.test(20);
	System.out.println(b);*/
		/*Predicate<String> p1=(i)->i.startsWith("A");
		boolean b=p1.test("padmi");
		System.out.println(b);*/
		/*String [] name= {"aadhi","Rohan","Aanil","Arjun"};
		Predicate<String> p1=(i)->i.endsWith("n");
		for(String x:name)
		{
			if(p1.test(x))
			{
				System.out.println(x);
			}
		}*/
		/*Employee e1=new Employee(1,"sandip");
		Employee e2=new Employee(2,"radhika");
		Employee e3=new Employee(3,"sachin");
		List<Employee> asList = Arrays.asList(e1,e2,e3);
		Predicate<Employee> p1=(i)->i.id>1;
		for(Employee e:asList)
		{
			if(p1.test(e))
			{
				System.out.println(e);
			}
		}*/
		Student s1=new Student(1,"Aaadhi","pune",23);
		Student s2=new Student(2,"paadhi","mumbai",20);
		Student s3=new Student(3,"naadhi","pune",17);
		Student s4=new Student(4,"raadhi","mumbai",19);
		Student s5=new Student(5,"jaadhi","nagpur",14);
		List<Student> of = List.of(s1,s2,s3,s4,s5);
		Predicate<Student> p1=(i)->i.city.equals("mumbai");
		Predicate<Student> p2=(j)->j.age>=19;
		Predicate<Student> joinedpredicate=(p1.and(p2));
		for(Student s:of)
		{
			if(joinedpredicate.test(s))
			{
				System.out.println(s);
			}
		}

}
}
