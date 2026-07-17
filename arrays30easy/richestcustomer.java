import java.util.Scanner;
public class richestcustomer{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("Enter values");
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int temp=0;
        int sum=0;
        int max=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum=sum+arr[i][j];
                if(sum>max){
                    max=sum;
                }
            }
            sum=0;
        }
        System.out.println("richest" +max);


    }
}