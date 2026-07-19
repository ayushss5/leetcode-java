import java.util.Scanner;
public class findevenumberofdigits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values of array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int f=0;
        for(int i=0; i<arr.length; i++){
            int d = arr[i];
            int c=0;
            while(d>0){
                d=d/10;
                c++;
            }
            if(c%2==0){
                f++;
            }
        }
        System.out.println(f);


    }
    
}
