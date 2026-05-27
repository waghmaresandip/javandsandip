package com.predefinedfunctionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.javaeight.User;

public class Supplier1 {
	public static void main(String[] args)
	{
		/*Supplier<Integer> s1=()->10;
		int i=s1.get();
		System.out.println(i);*/
		/*Supplier<Map<Integer,String>> s1=()->{
			Map<Integer,String> m2=new HashMap<Integer,String>();
			m2.put(1, "pune");
			m2.put(2, "mumbai");
			m2.put(3, "nagpur");
			return m2;
			
		};
		Map<Integer,String> m1=s1.get();
		System.out.println(m1);*/
		/*Supplier<String> s1=()->{
			String otp="";
			for(int i=1;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10);
				
			}
			return otp;
		};
			System.out.println(s1.get());
			System.out.println(s1.get());
			System.out.println(s1.get());
			System.out.println(s1.get());*/
		/*Supplier<User> s1=()->{
			User u1=new User(1,"rakesh");
			return u1;
			
		};
		User u=s1.get();
		System.out.println(u);*/
		
		
		
	}

}
