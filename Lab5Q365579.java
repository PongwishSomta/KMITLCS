public class Lab5Q365579 {
   
public static void main(String[] args) {
     
       int sum = 0 ;
        for (int i = 1; i < 200; i++) {
            if (i > 0 && i % 10 == 0) {
              continue;
            }
            else {
             sum += i ; 
            }
            System.out.println(sum);
          }
    }
}
