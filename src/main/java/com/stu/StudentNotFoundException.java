package com.stu;

public class StudentNotFoundException extends RuntimeException {
  public StudentNotFoundException(String msg)
  {
	  super(msg);
  }
}
