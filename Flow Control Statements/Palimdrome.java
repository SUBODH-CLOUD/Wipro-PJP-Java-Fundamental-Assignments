public class Palimdrome {
    public static void main(String[] args) {
        
                int num = 345543;
               int  temp = num;
               int rev = 0 ;
                while(num != 0){
                   int eachdigit = num%10;
                   rev = rev * 10 + eachdigit;
                   num = num/10;
                }
                if(rev == temp){
                    System.out.println(rev + " is a palindrome number.");
                }else{
                    System.out.println(temp + " is not a palindrome number");
                }
            }
        
        
    }

