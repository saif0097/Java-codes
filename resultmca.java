import java.util.Scanner;
public class resultmca {
    public static void main(String []args){
        System.out.println("Result of student are");
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Marks of ADBMS");
        int ADBMS = sc.nextInt();
        System.out.println("Enter the Marks of OT");
        int OT = sc.nextInt();
        System.out.println("Enter the Marks of SPM");
        int SPM = sc.nextInt();
        System.out.println("Enter the Marks of AIT");
        int AIT = sc.nextInt();
        System.out.println("Enter the Marks of Python");
        int Python = sc.nextInt();
        
       
        float sum =OT+ADBMS+AIT+Python+SPM/500;
        System.out.println("The Percenatge  of Student are");
        System.out.println(sum);
    }
    
}
