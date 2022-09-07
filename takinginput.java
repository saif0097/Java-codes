import java.util.Scanner;

public class takinginput{
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a= Sc.nextInt();
        System.out.println("enter number 2");
        int b= Sc.nextInt();
        int sum =a+b;
        System.out.println("The sum of these numbers is:");
        System.out.println(sum);


        
    }
}

