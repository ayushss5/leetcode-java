import java.util.Scanner;
import java.util.Arrays;
public class arlinsearch {
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENter value of target");
        int target = sc.nextInt();
        int f=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Index="+i);
                f=f+1;

            }

        }
        if(f==0){
            System.out.println("Target not found");

        }


    
}
}

