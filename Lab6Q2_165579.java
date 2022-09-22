import java.util.Arrays;

public class Lab6Q2_165579 {
    public static void main (String args[]) {
        int [] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};

        int max = Arrays.stream(data).max().getAsInt();

        System.out.println( "ค่าสูงสุดคือ "+max );
    }
}
