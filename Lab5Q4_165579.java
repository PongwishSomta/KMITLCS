public class Lab5Q4_165579 {
    
        public static void main(String[] args) {
            String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
            int M = 0;
            int W = 0;
    
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'M') {
                    M ++;
                } else {
                    W ++;
                }
            }
    
            System.out.println("Man = " + M + "Women " + W);
        }
    }
    

