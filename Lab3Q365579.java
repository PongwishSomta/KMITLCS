class Lab3Q365579 {
    public static void main(String[] args) {
         int n = 0;
         int sum = 0;
         while (n < 1000) {
            if (n%3 == 0 || n%5 == 0 ){
                sum += n; 
            }  
          n++; 
         }
       System.out.println(sum);

    }
}