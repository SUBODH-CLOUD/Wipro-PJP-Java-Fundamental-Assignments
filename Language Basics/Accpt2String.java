import java.util.*;

class Accpt2String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your company name ");
        String comapanyname = sc.nextLine();
        System.out.println("Enter the address ");
        String addressname = sc.nextLine();
        System.out.println(comapanyname + " " + addressname);

    }
}