package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args)
	{
		/*Product p1=new Product(1,"it");
		Product p2=new Product(2,"hr");
		Product p3=new Product(3,"CIVIL");
		Stream<Product> of = Stream.of(p1,p2,p3);
		Stream<Product> filter = of.filter((i)->i.id>=2);
		filter.forEach(i->System.out.println(i));
		}*/
		/*Product p1=new Product(1,"it");
		Product p2=new Product(2,"hr");
		Product p3=new Product(3,"civil");
      List<Product> al= Arrays.asList(p1,p2,p3);
      Stream<Product> stream = al.stream();
     Stream<Product> p= stream.filter((i)->i.name.startsWith("c"));
     p.forEach(j->System.out.println(j));*/
		/*Stream<Integer> of = Stream.of(1,2,3,4,5);
		of.forEach(i->System.out.println(i));*/
		/*Stream<String> of = Stream.of("raja","ramulanga");
		of.forEach(i->System.out.println(i));*/
		/*Employee e1=new Employee(1,"sandip","it");
		Employee e2=new Employee(2,"nilesh","hr");
		Employee e3=new Employee(3,"kiran","it");
		Employee e4=new Employee(4,"rahul","hr");
		Employee e5=new Employee(5,"satish","civil");
		List<Employee> asList = Arrays.asList(e1,e2,e3,e4,e5);
		Stream<Employee> stream = asList.stream();
		Stream<Employee> filter = stream.filter((i)->i.dep.equals("it"));
		Stream<String> map = filter.map(k->k.name);
		List<String> collect = map.collect(Collectors.toList());
		collect.forEach(i->System.out.println(i));*/
		/*Student s1=new Student(1,"sandip",91);
		Student s2=new Student(2,"santosh",88);
		Student s3=new Student(3,"sarika",92);
		Student s4=new Student(4,"satish",87);
		Student s5=new Student(5,"swapnil",90);
		List<Student> s=Arrays.asList(s1,s2,s3,s4,s5);
		Stream<Student> stream=s.stream();
		Stream<Student> filter = stream.filter(i->i.marks>90);
		List<Student> collect = filter.collect(Collectors.toList());
		collect.forEach(i->System.out.println(i));*/
		/*Book b1=new Book(1,"c++",200);
		Book b2=new Book(2,"java",250);
		Book b3=new Book(3,"python",300);
		Book b4=new Book(4,"kavi",350);
		Book b5=new Book(5,"lavi",400);
		List<Book> asList = Arrays.asList(b1,b2,b3,b4,b5);
		Stream<Book> stream = asList.stream();
		Stream<Book> filter = stream.filter(i->i.prize>200);
		List<Book> collect = filter.collect(Collectors.toList());
		collect.forEach(j->System.out.println(j));*/
		/*8List<String> asList = Arrays.asList("core java","advance java","python");
		List<String> asList2 = Arrays.asList("html","css","java script");
		
		List<List<String>> asList3 = Arrays.asList(asList,asList2);
		//asList3.forEach(i->System.out.println(i));
		Stream<String> flatMap = asList3.stream().flatMap(c->c.stream());
		//flatMap.forEach(k->System.out.println(k));
		Stream<String> map = flatMap.map(i->i.toUpperCase());
		map.forEach(i->System.out.println(i));*/
		
		Book b2=new Book(2,"java",250);
		Book b3=new Book(3,"python",300);
		Book b4=new Book(4,"lavi",400);
		Book b5=new Book(5,"javi",350);
		List<Book> of = List.of(b2,b3,b4,b5);
		Stream<Book> stream = of.stream();
		//stream.skip(3).forEach(k->System.out.println(k));
		//stream.distinct().forEach(k->System.out.println(k));
		/*long count = stream.count();
		System.out.println(count);*/
		/*boolean anyMatch = stream.anyMatch(i->i.name.equals("mava"));
		//System.out.println(anyMatch);
		/*boolean allMatch = stream.allMatch(i->i.id==2);
		System.out.println(allMatch);*/
		/*boolean noneMatch = stream.noneMatch(i->i.name.startsWith("k"));
		System.out.println(noneMatch);*/
		/*Student s1=new Student(1,"sandip",91);
		Student s2=new Student(2,"santosh",88);
		Student s3=new Student(3,"sarika",92);
		Student s4=new Student(4,"satish",87);
		Student s5=new Student(5,"swapnil",90);
		Stream<Student> g=Stream.of(s1,s2,s3,s4,s5);
		Stream<Student> filter = g.filter(i->i.marks>90);
		Stream<String> map = filter.map(k->k.name);
		List<String> collect = map.collect(Collectors.toList());
		collect.forEach(o->System.out.println(o));*/
		
		
}
}
