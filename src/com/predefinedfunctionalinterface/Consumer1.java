package com.predefinedfunctionalinterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class Consumer1 {
	public static void main(String[] args)
	{
	/*Consumer<Integer> c1=(i)->System.out.println(i);
	c1.accept(10);*/
		/*Consumer<String> c1=(i)->System.out.println(i.toUpperCase());
		c1.accept("raja");*/
		/*Consumer<int[]> c1=(i)->System.out.println(Arrays.toString(i));
		c1.accept(new int[] {10,20,30,40});*/
		/*Consumer<int[]> c1=(i)->{
			int sum=0;
			for(int x:i)
		{
			sum=sum+x;
		}
			System.out.println(sum);
		};
		c1.accept(new int[] {10,20,30,40});*/
		Consumer<int[]> c1=(i)->{
		int max=0;
		for(int j=0;j<i.length;j++)
		{
			if(i[j]>max)
			{
				max=i[j];
			}
		}
			System.out.println(max);
		};
		c1.accept(new int[] {10,20,30,40});
	}

}
