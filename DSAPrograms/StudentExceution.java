package com.DSAPrograms;

public class StudentExceution {

	public static void main(String[] args) {
Student s=new Student(); 
try {
    s.setmarks(167);
    System.out.println(s.getmarks());
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
s.setstudentId(222);
System.out.println(s.getstudentId());

s.setstudentName("nan");
System.out.println(s.getstudentName());
	}

}
