import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
            arr2[i+arr.length] = arr[i];


        }
        System.out.println(Arrays.toString(arr2));

    }
    
}
