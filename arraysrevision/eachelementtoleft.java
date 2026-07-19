import java.util.Scanner;
import java.util.Arrays;
public class eachelementtoleft {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        arr[arr.length-1] = arr[0];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(arr));






    
}
    
}
