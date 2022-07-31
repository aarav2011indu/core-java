package oops;

public class Employee {
public String Name;
public int Empid;
public String Department;

public Employee() {
	System.out.println("default cons");//default constructor
}

public Employee(String P1,int P2,String P3) {//parameterized constructor
	this.Name = P1;
	this.Empid = P2;
	this.Department = P3;
	
}


public void Display()

{
	 System.out.println(Name);
	 System.out.println(Empid);
	 System.out.println(Department);
}
}
