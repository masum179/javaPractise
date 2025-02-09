import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter value of m: ");
        int m = scan.nextInt();
        for (int i = 1; i<=n;i++){
            for (int j =1 ; j<= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class while_squre{
    public static void main(String[] args) {
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter the value of m: ");
        int m = scan.nextInt();

        while (i<=n){
            int j = 1;
            while (j<=m){
                System.out.print("M");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}


class Triangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scan.nextInt();
        for (int i = 0; i<=n;i++){
            for(int j = 0; j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class OtherTrianglw{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        for (int i = 0; i<= n;i++){
            for (int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}