package programs;
import java.util.Scanner;
public class ifelsestatement {
	public static void main(String [] args) {
		
		int age;
		System.out.println("Please enter your Age");
		Scanner sc = new Scanner(System.in);
		age =sc.nextInt();
		
//		switch(age) {
//		case 18:
//			System.out.println("You Are Adult");
//		break;
//		
//		case 23:
//			System.out.println("Find a job");
//		break;
//		
//		case 60:
//			System.out.println("Take Rest");
//		break;
//		
//		default:
//			System.out.println("Enjoy your life Dude");
//			
//		}
		
		if(age>24) {
			System.out.println("Weird");
		}
//		 else if (age>46){
//			 System.out.println("Your are semi-Experienced");
//			
//		}
//		 else if(age>36) {
//			 System.out.println("Your are semi-semi-Experinced");
		}
		 else {
			 System.out.println("Not Weird");
		 }
	}
}
