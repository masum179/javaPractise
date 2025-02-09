import java.util.*;
public class Function{
public static void printMyName(String name){
    System.out.println(name);
    return;
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine();

        printMyName(name);
    }
}
class Sum{
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = calculateSum(a,b);
        //System.out.println(sum);
    }
}
class Product{
    public static int calculateProduct(int a , int b){
        return a*b;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println("The product of two number is: "+calculateProduct(a,b));
    }
}


class Factorial{
    public static void printFactorial(int n){
        if (n<0) {
            System.out.println("Invalid number");
            return;}

        int factorial = 1;
        for (int i =n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.print("The factorial of "+n+" is ");
        printFactorial(n);
    }
}

class CheckPrime{
    public static boolean checkPrime(int n){
        if (n<2) return false;

        for (int i = 2;i<n;i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is "+n+" is Prime? "+ checkPrime(n));
    }
}

