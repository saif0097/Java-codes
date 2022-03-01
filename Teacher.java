   class Teacher{
   
   	String name;
   	int Teacher_id;
   	
   	Teacher(String name,int Teacher_id)
   		 {
   		 this.name=name;
   		 this.Teacher_id=Teacher_id;
   		 }
   		 
   	public static void main(String[]args)
   	    {
   	
   	Teacher T1= new Teacher("abc",455);
   	Teacher T2= new Teacher("xyz",565);
   	// Parameterlized constructor
   	System.out.println("Teacher 1:"+T1.name+" "+T1.Teacher_id);
   	System.out.println("Teacher 2:"+T2.name+" "+T2.Teacher_id);
   	
   	}
   }
