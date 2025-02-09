import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number and check this number is ever or odd");
        int number = scan.nextInt();
        if (number%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}

class checkAdult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        if (age>= 18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not adult");
        }
    }
}

class chekNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int a = scan.nextInt();
        System.out.print("please enter a number: ");
        int b = scan.nextInt();
        if (a>b){
            System.out.println("a is greater");
        } else if (a==b) {
            System.out.println("a is equal");
        }
        else {
            System.out.println("a is lesser");
        }
    }
}

class sorting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scan.nextInt();
        System.out.print("Enter a number: ");
        int b = scan.nextInt();
        System.out.print("Enter number: ");
        int c = scan.nextInt();
        if (a>b && b>c){
            System.out.println(a+">"+b+">"+c);
    } else if (c > b && a > c) {
            System.out.println(a+">"+c+">"+b);
        } else if (c>a && a>b) {
            System.out.println(c+">"+a+">"+b);
        } else if (c>b && b>a) {
            System.out.println(c+">"+b+">"+a);
        }else if (b>c && c>a) {
            System.out.println(b + ">" + c + ">" + a);
        }
        else {
            System.out.println(b + ">" + a + ">" + c);
        }
    }
}


class botton{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a botton: ");
        String botton = scan.next();
        switch (botton){
            case "a" :
                System.out.println("On");
                break;
            case "b" :
                System.out.println("Off");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}