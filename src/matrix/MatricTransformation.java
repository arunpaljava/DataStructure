package matrix;

import java.util.Scanner;

public class MatricTransformation {
     public static void main(String args []){
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         int arr[][] = new int[n][n];
         for(int i=0;i< arr.length;i++){
             for (int j=0;j<arr[0].length;j++){
                 arr[i][j]=scanner.nextInt();
             }
         }
         display(arr);
         System.out.println();
         display(transormMatric(arr));
     }

    public static int[][] transormMatric(int [][] arr){
        for(int i=0;i< arr.length;i++){
            for (int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

     public static void display(int [][] arr){
         for(int i=0;i< arr.length;i++){
             for (int j=0;j<arr[0].length;j++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
     }
}
