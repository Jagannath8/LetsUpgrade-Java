import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        

        System.out.println("Enter 5 numbers ");
        int add=0; 
        for(int i=0; i<5; i++){
           arr[i] = sc.nextInt();
           }

        for(int i=0; i<5; i++)
            add = arr[0] + arr[1] + arr[2] + arr[3] + arr[4]; 
            System.out.println("The sum is " + add);
        }
        
    }


