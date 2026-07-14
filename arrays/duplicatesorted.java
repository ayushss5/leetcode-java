import java.util.*;
public class duplicatesorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values of array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }
        int k=1;
        for(int i=1; i<arr.length; i++){
            if (arr[i]!=arr[i-1]) {
                arr[k] = arr[i];
                k++;    
            }
        }
        System.out.println("Unique element:" +k);
        for(int x=0 ; x<k; x++){
            System.out.println(arr[x]);
        }
        sc.close();
    }

}

