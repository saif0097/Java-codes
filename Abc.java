   public class Abc{
   	int AbcAge;
   	
   	public Abc(String name){
   	
   		System.out.println("name is chossen is:"+name);
   		}
   		
   	public void setAge(int age){
   		AbcAge= age;
   	}
   	
   	public int getAge(){
   	System.out.println("Abc age is:"+ AbcAge);
   	return AbcAge;
   	}
   	
   	public static void main(String[]args){
   	
   	Abc blueAbc = new Abc ("raju");
   	
   	blueAbc.setAge( 2 );
   	
   	blueAbc.getAge();
   	
   	System.out.println("variable value :"+blueAbc.AbcAge);
   	
   	}
   }	
