

class PrintSum{
    public static void main(String[] args) {
        int array[] = {6,7,9,7};
        float sum=0;
        for(int i =0; i< array.length; i++){
        int number = array[i];
        sum = sum + number;
        }
        System.out.println("Sum " + sum);
        float average = sum/array.length;
        System.out.println("average " + average);
    }
}