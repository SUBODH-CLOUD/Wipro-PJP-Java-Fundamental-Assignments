public class SumofAlldigits {
    public static void main(String[] args) {
        int num = 555, sum=0;
        int temp = num;
        while (num != 0 ){
           int  eachdigit = num%10;
           sum = sum + eachdigit;
           num = num/10;
        }
        System.out.println("Sum of " + temp + " is " + sum);
    }
}
