import java.util.Scanner;

public class lab41 {
    public static void name(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum = 0;
        int a = 1;
        
    
    if (a < 0 ) {
       System.out.print("Pls input num");
       a = input.nextInt();
       
       if ( a % 2 == 0 || a > 0 ){
        sum += a; 
       }
       else {
        return;
       }
    }
       System.out.println("sum" + sum);

       }
    }
    

