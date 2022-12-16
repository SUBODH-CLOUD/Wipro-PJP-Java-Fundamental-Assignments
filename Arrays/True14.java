public class True14 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        boolean flag = false;
        boolean flag2 = false;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==1||arr[i]==4){
                flag = true;
            }else
           flag2 = true;

        }
        if(flag){
            System.out.println("true");
        }
        if(flag2)
        System.out.println("false");
    }
}
