import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2};
        int[] arr2 = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2 != 0){
                arr2[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}
