package com.DSAPrograms;

import java.util.Scanner;

public class PayRoll_System {

	public static void main(String[] args) {
		double Netsal;

		Scanner s=new Scanner(System.in);
		Employe_Details person=new Employe_Details();
		person.setEmployee_Id(101);
		person.setEmployee_NAme("ravi");
		person.setEmployee_type("Full-Time");
person.setBasic_Salary(12000);
System.out.println("employee first details");
System.out.println("salary :"+person.getBasic_Salary());
System.out.println("ID is :"+person.getEmployee_Id());
System.out.println("Name :"+person.getEmployee_NAme());
if(person.getEmployee_type().equals("Full-Time")) {
	double HRa=0.2*person.getBasic_Salary();
	double DA=0.1*person.getBasic_Salary();

	Netsal=person.getBasic_Salary()+HRa+DA;
	
	System.out.println("total sal of full time Employer:"+Netsal);
	
	
}

Employe_Details person1=new Employe_Details();
person1.setEmployee_Id(102);
person1.setEmployee_NAme("kumar");
person1.setEmployee_type("Part-Time");
person1.setBasic_Salary(8000);
System.out.println("employee second details");
System.out.println("salary :"+person1.getBasic_Salary());
System.out.println("ID is :"+person1.getEmployee_Id());
System.out.println("Name :"+person1.getEmployee_NAme());
if(person1.getEmployee_type().equals("Part-Time")) {
	double Allowances=0.05*person1.getBasic_Salary();

	Netsal=person1.getBasic_Salary()+Allowances;
	
	System.out.println("total sal of part time Employer:"+Netsal);
}

Employe_Details person2=new Employe_Details();
person2.setEmployee_Id(103);
person2.setEmployee_NAme("sasi");
person2.setEmployee_type("Contract");
person2.setBasic_Salary(14000);
System.out.println("employee third details");
System.out.println("salary :"+person2.getBasic_Salary());
System.out.println("ID is :"+person2.getEmployee_Id());
System.out.println("Name :"+person2.getEmployee_NAme());

 
 if(person2.getEmployee_type().equals("Contract")) {

	Netsal=person2.getBasic_Salary();
	
	System.out.println("total sal of contract time Employer:"+Netsal);
}

	}

}
