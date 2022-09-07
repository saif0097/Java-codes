public class operatorprecedence {
    public static void main(String[] args){
         // Precedence && Associativity
        //int a =6*4-34/2;
        /* 
        Highest  precedence goes to * and /.They are then evalauted on the basis of left to right associativity.
            =24-34/2
            =24-17
            =7

        */
        //int b =60/4-34*2; //left to right Associativity
        /*
          =15-34*2
          =15-68
          =-53
         */
       // System.out.println(a);
       // System.out.println(b);
       
        //Quick quiz

        int x = 6;
        int y = 1;
      //  int k = x*y/2;
        int b=1;
        int c=4;
        int a=5;
        int k = (b*b-4*a*c)/(2*a);
        System.out.println(k);
    }
    
}
