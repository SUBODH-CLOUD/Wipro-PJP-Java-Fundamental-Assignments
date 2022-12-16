public class Ascii {
    public static void main(String[] args) {
        int[] array = new int[]{55,32,85,57,67,65,97,98,99,100};
        for(int i = 0; i<array.length; i++){
            char ch = (char)array[i];
            System.out.print(ch + " ");
        }
    }

    
}
