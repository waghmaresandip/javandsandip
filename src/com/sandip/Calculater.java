package com.sandip;

public class Calculater {
	static void calculate(Ao ao)
	{
		ao.calculate(10,20);
	}


public static void main(String[] args)
{
	/*Addition addition=new Addition();
	calculate(addition);
	calculate(new Substraction());
	calculate(new Multiplication());
	calculate(new Division());*/
	calculate((int a,int b)-> {System.out.println("addition is"+(a+b));});
	calculate(( a, b)->{System.out.println("susstraction is"+(a-b));});
    calculate((a,b)->System.out.println("multiplication is"+(a*b)));
    calculate((a,b)->System.out.println("division is"+(a/b)));
}
}
