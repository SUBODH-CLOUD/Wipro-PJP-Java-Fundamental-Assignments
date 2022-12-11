public class Prime10To99 {
    public static void main(String[] args) {
        int firstnum = 10;
        int lastnum = 99;

        
            for(firstnum = 10 ; firstnum<=lastnum; firstnum++){
                boolean flag = true;
                for( int i =2; i <= (firstnum/2); i++){
                if(firstnum%i==0){
                    flag = false;
                    break;   
                }   
            }
            if(flag){
                System.out.println(firstnum);
            }
        }
    }
}

