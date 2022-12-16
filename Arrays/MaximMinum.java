public class MaximMinum {
    public static void main(String[] args) {
        int[] array = new int[]{6,8,9,4,8};
        int max = array[0];
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }else if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Maximum value of the array : " + max);
        System.out.println("Minimum value of array : " + min);
    }
}
