package com.stream;

public class Employee {

	 
		int id;
		String name;
		String dep;
		public Employee(int id,String name,String dep)
		{
			super();
			
			this.id=id;
			this.name=name;
			this.dep=dep;
			
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + "]";
		}
		
		
		
	

	

}
