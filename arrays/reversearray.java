import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int left=0, right=arr.length-1; left<right; left++, right--){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println("Reversed array is:");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
    
}
