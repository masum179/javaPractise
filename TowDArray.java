import java.util.*;
public class TowDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row size: ");
        int rows = sc.nextInt();
        System.out.println("Imput collum: ");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        System.out.println("Input");
        for (int i = 0; i<rows;i++){
            for (int j = 0; j<cols;j++){
                System.out.println("Please input a value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output");
        System.out.println("Number of row: "+ arr.length);
        for (int i =0; i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

class FindX{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row: ");
        int row = sc.nextInt();
        System.out.println("Collum: ");
        int cols = sc.nextInt();
        int mat [][] = new int[row][cols];

        System.out.println("Enter searching number: ");
        int x = sc.nextInt();

        System.out.println("Input");
        for (int i = 0; i<mat.length;i++){
            System.out.println("Size of row: "+ mat.length);
            for (int j = 0;j<mat[i].length;j++){
                System.out.println("Size of collums: "+ mat[i].length);
                System.out.println("Enter value in matrix");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output");
        for (int i= 0;i<mat.length;i++){
            for (int j = 0; j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
                if (mat[i][j]==x){
                    System.out.println(x+ " found at index ("+i+" "+j+")");
                    break;
                }
            }
            System.out.println();
        }
    }
}