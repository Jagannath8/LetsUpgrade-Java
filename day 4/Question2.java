
// // Create an int array with 5 values and print only odd values. 

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers ");
        
        // arr[0]=10;
        // arr[1]=13;
        // arr[2]=17;

        for(int i=0; i<5; i++){
           arr[i] = sc.nextInt();
           }

        for(int i=0; i<5; i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i] + " " + "is a odd number ");
            }
        }
 
    }
}


