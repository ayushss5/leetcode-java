package arrays30easy;
import java.util.Scanner;

public class thirdmax {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;;
        int max3 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
                if(arr[i]>max2){
                    max2=max3;
                    max2=max1;
                }
            }

        }

    }
    
}
