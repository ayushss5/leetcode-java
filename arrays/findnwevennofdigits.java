import java.util.Scanner;

public class findnwevennofdigits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values of arrays");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count2 = 0;
        for(int i=0; i<arr.length; i++){
            int count1 = 0;
            int num = arr[i];
            int count = 0;
            while(num>0){
                num = num/10;
                count1++;

            }
            if(count1%2==0){
                count2++;
            }



        }
        System.out.println("Number =" +count2);




    }



    
}
