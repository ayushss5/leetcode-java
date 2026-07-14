import java.util.*;

public class dsapractice {
    public static void main(String[] args){

    
    int arr[] = {1,2,3,4,5,6};
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);

    }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int arr2[] = new int[size];
    System.out.println("Enter values");
    for(int i=0;i<size;i++){
        arr2[i] = sc.nextInt();
    }
    for(int i=0; i<arr2.length;i++){
        if(arr2[i]==5){
            System.out.println("At Index:"+i);
            System.out.println("At Position:" +(i+1));
        }
    }
    for(int i=0;i<size;i++){
        if (arr2[i] ==0 ){
            arr2[i] = 10;
    }
    for(int x=0;x<arr2.length;x++){
        System.out.println(arr2[x]);

    }
    arr2[0]=100;
    for(i=0;i<arr2.length;i++){
        System.out.println(arr2[i]);
    }
    sc.close();

    }

    }
    
    }
    

