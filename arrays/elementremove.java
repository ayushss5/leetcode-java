import java.util.*;
public class elementremove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for(int i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k=0;
        int val = 3;
        for(int i=0; i<arr.length; i++){
            if (arr[i]!= val) {
                arr[k] = arr[i];
                k++;
                
            }
        }
        System.out.println("Value of K is:" +k);
        for(int x=0 ; x<k ; x++){
            System.out.println(arr[x]);
        }
        sc.close();
    }
    
}
