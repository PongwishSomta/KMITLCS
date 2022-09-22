public class lab7Q1_65579 {
    public static void main(String[] args) {
    int fact = 1 ;
    int number = 6 ;

    fact = factorial(number);

    System.out.println("Factorail of " + number + " is " +fact);        
    }

    static int factorial(int n) {
         if(n == 0 )
         return 1 ;
         else
         return(n * factorial(n-1));
        }
}
