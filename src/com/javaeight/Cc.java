package com.javaeight;

import java.util.Arrays;
import java.util.ArrayList;
public class Cc  {
	
	public static void main(String[] args)
	{
		/*Cc n=new Cc();
		n.add(10,20);*/
		/*Test t=(a,b)->System.out.println("addition is"+(a+b));
		t.add(10,20);*/
		/*Test t1=(a,b)->System.out.println(a.toUpperCase()+""+b.toLowerCase());
		t1.add("rahul", "kumar");*/
		/*Test t=(a,b)->System.out.println(a+""+b.charAt(2));
		t.add(10,"rajesh");*/
		/*Test t=(a,b)->{return "rahul is good boy";};
		String str=t.add(10,10.10);
		System.out.println(str);*/
		/*Test t=(u)->"sacin is good bay";
		User user=new User();
		user.id=101;
		user.name="sarika";
		String str=t.add(user);
		System.out.println(str);*/
		/*Test t=(a)->System.out.println(a.id+""+a.name);
		User user=new User();
		user.id=101;
		user.name="sachin";
		
		t.add(user);*/
		/*Test t=()->{User u=new User();
		u.id=101;
		u.name="rahul";
		return u;};
		User u1=t.add();
		System.out.println(u1.id+""+u1.name);*/
		/*Test t=()->{return new int[] {10,20,30,40,50};};
		int[] arr=t.add();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		/*Test t=(a,b)->System.out.println(Arrays.toString(a)+""+Arrays.toString(b));
		int[] x= {10,20,30,40,50};
		String[] y= {"rajesh","praful","jignesh"};
		t.add(x,y);*/
		/*Test t=()->{User[] user=new User[2];
		User u1=new User();
		u1.id=102;u1.name="satish";
		User u2=new User();
		u2.id=103;
		u2.name="sunil";
		user[0]=u1;
		user[1]=u2;
		return user;
		
		};
		User[] i=t.add();
		for(User u:i)
		{
			System.out.println(u);
		}*/
		/*Test t=(u)->{for(User p:u)
		{
			System.out.println(p);
		}
		};
		User[] user=new User[2];
		User u1=new User();
		u1.id=101;
		u1.name="sachin";
		User u2=new User();
		u2.id=102;
		u2.name="swapnil";
		user[0]=u1;
		user[1]=u2;
		
		t.add(user);*/
		
		/*Test t=()->{ArrayList<User> u1=new ArrayList<User>();
		User u2=new User(1,"tushar");
		User u3=new User(2,"rushab");
		u1.add(u2);
		u1.add(u3);
		return u1;
		
			
		};
		ArrayList<User> al=t.add();
		for(User uq:al)
		{
			System.out.println(uq);
		}*/
		Test t=(e)->{for(User u:e)
		{
			System.out.println(u);
		}
		};
		ArrayList<User> al=new ArrayList<User>();
		User u1=new User(1,"danish");
		User u2=new User(2,"sarlak");
		al.add(u1);
		al.add(u2);
		t.add(al);
		
		
	

}
}