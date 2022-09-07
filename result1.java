import java.util.Scanner;
    
    public class result1{
        public static void main(String []args){
        System.out.println("result of the Student");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the marks subject 1");
        int subject1= sc.nextInt();
        System.out.println("Enter the marks subject 2");
        int subject2= sc.nextInt();
        System.out.println("Enter the marks subject 3");
        int subject3=sc.nextInt();
        System.out.println("Enter the Marks of Subject 4");
        int subject4= sc.nextInt();
        int d = subject1+subject2+subject3+subject4/100;
        System.out.println("The result of Student Are:");
        System.out.println("total="+d/100);
        }
    }