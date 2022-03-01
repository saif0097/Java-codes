public class Puppu{
		int puppuage;
		
		public Puppu(string name){
		
		System.out.println("name chosen is:"+name);
	}
		public void setAge(int age){
			puppuAge = age;
			}
			
		public int getAge(){
		 				  Sytem.out.println("Puppu's age is:" +puppuAge);
		 return puppuAge;
		}
		
		public static void main(String []args){
		Puppu myPuppu =new Puppu("tommy");
		
		myPuppu.setAge(3);
		
		myPuppu.getAge();
		
		System.out.println("variables value:"+myPuppu.PuppuAge);
		}
	}
