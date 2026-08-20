package com.DSAPrograms;

public class Student {
private int studentId;
private String studentName;
private int marks;

public void setmarks(int marks){
if(marks>=0 && marks<=100) {
	this.marks=marks;
}
else {
	 throw new IllegalArgumentException("zero");
}
}

int getmarks(){
return marks;	
}


public void setstudentId(int studentId){
	this.studentId=studentId;
}

int getstudentId(){
return studentId;	
}

public void setstudentName(String studentName){
	this.studentName=studentName;
}

String getstudentName(){
return studentName;	
}
	

}
