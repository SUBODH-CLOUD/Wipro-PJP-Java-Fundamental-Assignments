public class Large2maxmin {
    public static void main(String[] args) {
        int[] array = new int[]{1,9,8,5,8,4,6,1};
        int max=array[0];
        int min=array[0];
        int secondMax = array[0];
        int secondMin = array[1];
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }else if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
            for(int i=0; i<array.length; i++){
                if(max!=array[i]){
                    if(secondMax<array[i]){
                        secondMax = array[i];
                    }
                }
               if(secondMin > array[i]){
                    if(min != array[i]){
                        secondMin = array[i];
                    }
                }
            }
        
        System.out.println("SecondMaximum number is : " + secondMax);
        System.out.println("Second Minimum is : " + secondMin);
    }
}

