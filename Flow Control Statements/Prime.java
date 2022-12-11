public class Prime {
    public static void main(String[] args) {
        int num = 7;
       int temp = num;
       boolean flag = true;
        int numhalf = num/2;
       if(num==1 || num == 0){
        System.out.println(temp + " is not a prime number.");
       }else{
       for(int i=2; i<=numhalf; i++){
            if(num%i==0){
                System.out.println(temp + " is not a prime number.");
               flag = false;
               break;
            }
       }
      if(flag){
        System.out.println(temp + " is a prime number.");
      }

    
       }
    }
}

