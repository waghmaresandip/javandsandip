package com.sonali;

public interface Test<T,R> {
	//void add(T t,T t1);//void add(Integer a,Integer b);
	//void add(T t,T t1);//void add(String s,String w);
	//void add(T t);//void add(int[] arr);
	//void add(T t,U u);//void add(String,Integer);
	//void add(T t,U u);//void add(int[] arr,String[] st);
	//void add(T u,U i);?//void add(User u,Integer i);
	//T add(T t,T t1);//Integer add(Integer i,Integer u);
	//T add(T t,T i);//String add(String t,String u);
	//R add(T t,U u);//Integer add(String str,Integer i);
	//R add(T t);//Integer add(int[] arr);
	R add(T t);//String add(String[] arr);

}
