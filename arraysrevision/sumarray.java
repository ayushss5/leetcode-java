import java.util.Scanner;
import java.util.Arrays;
public class sumarray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter values");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int s = 0;
        for(int i=0; i<arr.length; i++){
            s = s+arr[i];
        }
        System.out.println("Sum =" +s);

    }
}