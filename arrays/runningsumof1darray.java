import java.util.Arrays;
import java.util.Scanner;
public class runningsumof1darray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length-1; i++){
            arr[i+1] = arr[i] +arr[i+1];

        }
        System.out.println(Arrays.toString(arr));

    }

    
}
