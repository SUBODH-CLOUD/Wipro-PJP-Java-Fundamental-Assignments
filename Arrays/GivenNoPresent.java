public class GivenNoPresent {
    public static void main(String[] args) {
        int[] array = new int[]{7,9,67,54,67,86,865};
        int num = 86;
       boolean flag =  true;
        for(int i = 0; i< array.length; i++){
               if(array[i] == num){
                    System.out.println("Number is at index : " + i);
                    flag = false;
               }
            }
            if(flag){
        System.out.println("-1");
            }
    }
}
