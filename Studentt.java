public class Studentt {
	
	String name;
	int Student_id;
	
	Studentt(String name,int Student_id)
	{
	this.name=name;
	this.Student_id=Student_id;
	}
	public static void main(String []args)
	
	{
	Studentt S1= new Studentt("abhi",45);
	Studentt S2= new Studentt("saggy",56);
	
	System.out.println("Studenttn 1:"+S1.name+""+S1.Student_id);
	System.out.println("studentt 2:"+S2.name+""+S2.Student_id);
	}
}
