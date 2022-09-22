public class Lab6Q2_265579 {
    public static void main(String[] args) {
        String input = "10 10 10 01 10 10 01";
        String[] x = input.split(" ");
        int sum = 1;
        for(int i = 1; i < x.length; i++) {
            if(!x[i].equals(x[i-1])){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
