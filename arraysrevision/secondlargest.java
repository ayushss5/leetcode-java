import java.util.Scanner;
import java.util.Arrays;
public class secondlargest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max1= Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] >max2 && arr[i]!=max1 ){
                max2 = arr[i];
            }
        }
        System.out.println(max2);

    }
}