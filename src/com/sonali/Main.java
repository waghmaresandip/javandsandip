package com.sonali;

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
	/*Test<Integer> t=(i,j)->{
		System.out.println("i am from igatpuri");	};
    t.add(10, 20);*/
		/*Test<String> t=(i,j)->{
			System.out.println(i+j);
		};
		t.add("Rahul", "Rohan");*/
		//Test<int[]> t=(i)->{
			//System.out.println(Arrays.toString(i));
			/*for(int r:i)
			{
				System.out.println(r);
			}*/
		//};
	//	t.add(new int[] {10,20,30,40});
		/*Test<String,Integer> t =(i,j)->{
			System.out.println(i+""+j);
		};
		t.add("rakesh",10);*/
		/*Test<int[],String[]> t=(i,j)->{
			System.out.println(Arrays.toString(i)+""+Arrays.toString(j));
		};
		t.add(new int[] {10,20,30,40}, new String[] {"raja","rahul","dinesh"});*/
		/*Test<User,Integer> t=(i,j)->{
			System.out.println(i.id+""+i.name+j);
		};
		User u1=new User();
		u1.id=101;
		u1.name="dinesh";
		t.add(u1,10);*/
		/*Test<Integer> t =(i,j)->
		{
			return (i+j);
		};
		System.out.println(t.add(10, 20));*/
		/*Test<String> t=(i,j)->{
			return i;
		};
			System.out.println(t.add("raja","rani"));*/
		/*Test<String,Integer,Integer> t=(i,j)->{
			//return j;
			return i.length();
		};
		System.out.println(t.add("raja",10));*/
		//Test<int[],Integer> t=(i)->{
			/*int sum=0;
			for(int x:i)
			{
				sum+=x;
			}
			return sum;*/
			/*int max=0;
			
			
			for(int j=0;j<i.length;j++)
			{
				if(i[j]>max)
				{
					max=i[j];
				}
			}
			return max;*/
			
	/*	};
		int i=t.add(new int[] {10,20,30,40});
		System.out.println(i);*/
		Test<String[],String> t=(i)->{
			for(String x:i)
			{
			if(x.startsWith("r"))
			{
				return x;
			}
			}
			return "no found";
			
		};
		String str=t.add(new String[] {"paja","rahul","oinesh"});
		System.out.println(str);
}
}
