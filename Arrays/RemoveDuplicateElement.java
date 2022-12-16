import java.util.Arrays;

//import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = new int[]{12,34,12,45,45,67,89};

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){   // Loop to sort the element
                if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;          
                }
            }
            
       }

       int count = 0;
       for(int i = 0; i<arr.length-1; i++){ // Loop to count the same  value in the array
           if(arr[i]==arr[i+1]){
                count=count+1;
             }
        }

        int arr2j = 0; 
        boolean flag = false;                     // for last element
        int[] arr2 = new int[arr.length-count];   //Array to store unique element
        for(int i=0; i<arr.length-1; i++){        // Loop to assign the value in the  array(arr2)
                if(arr[i] != arr[i+1]){
                arr2[arr2j] = arr[i];             //Storing all element except last(if not equal to previous)
                     arr2j++; 
                     flag = true;                 // To check last element is not equal to previous element
                }
            }
            if(flag){                             // Condition to assign the last element of the array(arr)
                arr2[arr2j] = arr[arr.length-1];
            }

             System.out.println(Arrays.toString(arr2));
            
       }
       
    }

