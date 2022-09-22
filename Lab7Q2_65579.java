public class Lab7Q2_65579 {
  public static void main(String[] args) {
    int [] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9}; 
    
    System.out.println(maxElement(data));
  }
  static int maxElement(int [] arr) {
    int max = Integer.MIN_VALUE;
    int i = 0;
    while ( i < arr.length ){
        if(arr[i] > max){
            max = arr[i];
        }
        i++;
    }
    return max ;
  }
}