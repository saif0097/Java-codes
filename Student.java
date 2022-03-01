	class Student{
	 String name;
	 int Student_id;
	 
	 Student(String name,int Student_id)
	 	{
	 	this.name= name;
	 	
	 	this.Student_id=Student_id;
	 	}
	 
	 public static void main(String[] args)
	   { 
	 	Student S1= new Student("shubham",455);
	 	Student S2= new Student("pawan",655);
	 	//parameterlized constructor
	 	System.out.println("Student 1:"+S1.name+""+S1.Student_id);
	 	
	 	System.out.println("Student 2:"+S2.name+""+S2.Student_id);
	 	
	 	}
	 }
	 
