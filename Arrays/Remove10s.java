import java.util.Arrays;

class Remove10s{
    public static void main(String[] args) {
        int[] arr = new int[]{1,99,10};
        int[] arr2 = new int[arr.length];
        int j =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=10){
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}