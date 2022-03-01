class Employee{
	String name;
	int emp_id;
	
	Employee (String name,int emp_id)
	{
	this.name=name;
	
	this.emp_id=emp_id;
	}
	
	public static void main(String []args)
	{
	Employee E1= new Employee("deepak",111);
	
	Employee E2= new Employee("sagar",112);
	
	//parameterlized constructor
	
	System.out.println("Employee 1:"+E1.name+" "+E1.emp_id);
	System.out.println("Employee 2:"+E2.name+" "+E2.emp_id);
	}
}
