public class Lab5Q5_165579 {
    
    public static void main(String[] args) {
        int n = 10;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x == y) {
                    System.out.print(" ");
                } else if (x == 9-y) {
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                }
            }

            System.out.println();
        }
    }
    
}

