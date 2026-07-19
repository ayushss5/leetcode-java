import java.util.Scanner;
import java.util.Arrays;
public class isSorted{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean x = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                x = false;
                break;

            }
        }
        System.out.println(x);

    }
}