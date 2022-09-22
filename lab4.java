import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner temp=new Scanner(System.in);
      
      System.out.println("input tempurature"); 
      
      float fahren=temp.nextFloat();
      
      float cel = (fahren-32)*5/9;

      System.out.println(fahren+ "F =" + cel + "C");

      temp.close();

    }
  }

