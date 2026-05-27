package com.predefinedfunctionalinterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Function1 {
	public static void main(String[] args)
	{
		/*Function<Integer,String> f1=(i)->String.valueOf(i);
		String str=f1.apply(10);
		System.out.println(str);*/
		/*Function<User[],String> f1=(i)->{
			for(User y:i)
			{
				System.out.println(y);
			}
			return "iam";
		};
		User[] users=new User[3];
		User u1=new User(1,"pune");
		User u2=new User(2,"mumbai");
		User u3=new User(3,"nagpur");
		users[0]=u1;
		users[1]=u2;
		users[2]=u3;
		
		String str=f1.apply(users);
		System.out.println(str);*/
		/*Function<int[],HashSet<Integer>> f1=(i)->{
			HashSet<Integer> hr=new HashSet<Integer>();
			for(int x:i)
			{
				hr.add(x);
			}
			return hr;
			
		};
		HashSet<Integer> hs=f1.apply(new int[] {10,20,30,40,10,20});
		System.out.println(hs);*/
		/*Function<Map<Integer,String>,User[]> f1=(i)->{
			
			
			System.out.println(i);
			
			User[] users=new User[2];
			User u1=new User(1,"lalait");
			User u2=new User(2,"kamu");
			users[0]=u1;
			users[1]=u2;
			return users;
			
		};
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1,"rajul");
		m1.put(2,"jatin");
		m1.put(3,"gangurge");
		User[] u1=f1.apply(m1);
		for(User n:u1)
		{
			System.out.println(n);
		}*/
		/*BiConsumer<Integer,Integer> bc=(i,j)->System.out.println(i+""+j);
		bc.accept(10,20);*/
		/*BiFunction<Integer,Integer,String> bf=(i,j)->{
			return (Integer.toString(i)); 
		};
		System.out.println(bf.apply(10,20));*/
		BiPredicate<int[],String[]> bp=(i,j)->{return j.equals("roja")&&i.length==4;
			
		};
		boolean b=bp.test(new int[] {10,20,30,40},new String[] {"roja"});
		System.out.println(b);
	}

}
