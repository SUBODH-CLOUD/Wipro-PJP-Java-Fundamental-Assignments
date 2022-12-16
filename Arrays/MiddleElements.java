import java.util.Arrays;

public class MiddleElements {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,9};
        int[] arr2 = new int[]{1,4,5};
        int i = 0;
        if(arr.length%2!=0){
             i = (arr.length-1)/2;
        }
        int[] arrnew = new int[2]; 
         arrnew[0] = arr[arr.length-i-1];
         arrnew[1] = arr2[arr.length-i-1];
         System.out.println(Arrays.toString(arrnew));
    }
}
