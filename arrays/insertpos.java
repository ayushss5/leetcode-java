import java.util.Arrays;
import java.util.Scanner;

public class insertpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int target = 5;
        System.out.println("Enter values");
        for(int i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int pos = arr.length;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]>=target){
                pos = i;
                break;

            }
        }
        System.out.println("Insert position" +pos);
        sc.close();
        
    }
}
            
        

       



    
    

