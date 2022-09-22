public class Lab4Q365579 {
    public static void main(String... args) {

        int amountCharge = 0;
        int hrsPark = 0;
      

        for (int i = 0; i < args.length; i++) {
            hrsPark = Integer.parseInt(args[i]);
            amountCharge = 0;
            
            
        while (hrsPark > 0 ) {
             
            if  (hrsPark <= 2) {
                amountCharge += 4;
                hrsPark -= 2;
                
            } else if (hrsPark <= 4) {
                amountCharge += 3;
                hrsPark -= 1;

            } else if (hrsPark > 4  && hrsPark < 18) {
                amountCharge += 1;
                hrsPark -= 1;
            } else if (hrsPark >= 18) {
                amountCharge += 24;
                hrsPark -= 24;
            }
        }
        System.out.println(amountCharge + " dollar");
        }
    }
}