import java.util.Arrays;

public class SortingArray2 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,8,5,5,6,4};

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;          
                }
            }
            
       }
      
       System.out.println(Arrays.toString(arr));
    }
}
