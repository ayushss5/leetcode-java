import java.util.Scanner;

public class twosum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==10){
                System.out.println("The indexes are: " +i+  "and" +j);
               } 
            }
            sc.close();
        }

        
    }
    
}

