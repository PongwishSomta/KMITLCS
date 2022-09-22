public class Lab4Q265579 {
    public static void main(String[] args) {
      int leastPrice = Integer.MAX_VALUE; 
        int sum = 0; 
        int price = 0; 

        for (int i = 0; i < args.length; i++) { 
            price = Integer.parseInt(args[i]); 

            if (price < leastPrice) { 
                leastPrice = price; 
            }
        }

        for (int priceIndex = 0; priceIndex < args.length; priceIndex++) { 
            sum += Integer.parseInt(args[priceIndex]); 
        }

        System.out.println("SUM: " + (sum - leastPrice) + " dollar"); 
    }
  }
