

import java.util.Scanner;

public class maxcons {
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values of arrays");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int c=0;
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                c++;
                if(c>max){
                    max=c;
                }
            }
            else{
                c=0;
            }

        }
        System.out.println("Max cons ones="+max);
}
}
