public class ReverseNum {
    public static void main(String[] args) {
        int num = 333337;
       int  temp = num;
        while(num != 0){
           int eachdigit = num%10;
           System.out.print(eachdigit);
           num = num/10;
        }
    }
}
