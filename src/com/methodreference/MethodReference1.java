package com.methodreference;

public class MethodReference1 {
	public static void main(String[] args)
	{
		/*Test t=new Login()::fun;
		t.add();*/
		/*Test t1=new Login()::fun;
		t1.add(10);*/
		/*Test t=Login::fun;
		t.add();*/
		/*Test t=Login::fun;
		t.add(10);*/
		/*Test t=Login::new;
		t.add();*/
		Test t=Login::new;
	t.add(10);
	}

	
}
