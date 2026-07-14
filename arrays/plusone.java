import java.util.Arrays;
import java.util.Scanner;
public class plusone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter values of array");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        boolean carry = true;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                carry = false;
                break;
            }
            arr[i]=0;
        }
        if(carry==true){
            int arr2[] = new int[arr.length+1];
            arr2[0] = 1;
            System.out.println(Arrays.toString(arr2));

        }
        else{
             System.out.println(Arrays.toString(arr));
        }
        sc.close();
  
    }
}


    


