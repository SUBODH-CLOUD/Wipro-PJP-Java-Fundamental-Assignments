

class SumOfElement67{
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,4,7,9};
        int index6=0;
        int index7=0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==6 || arr[i] ==7){
                if(arr[i]==6){
                    index6=i; // 2
                }else{
                    index7 = i; // 5
                }
            }
        } 
        //  int sub =0;
        // if(index6<index7){
        //      sub = index7-index6-1;
        // }
            int sum = 0;
            for(int j=0; j<arr.length; j++){
              if(j < index6 || j > index7){
                  // System.out.print(arr[j]);
                   sum = sum + arr[j];
                }
            }
            System.out.println("Sum is " + sum);
        }


    
}