import java.util.*;
public class loop {
    public static void main(String[] args) {
        System.out.println("We're use loop");
    }
}
class uses_for_loop{
    public static void main(String[] args) {
        int i =1 ;
        Scanner scan =new  Scanner(System.in);
        System.out.print("Which number: ");
        int number = scan.nextInt();
        for (i= 1;i<=10;i++){
            System.out.println(number+ " x " +i +" = "+number*i);
        }
    }
}
class avgFor{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last number: ");
        int number = scan.nextInt();
        double sum = 0;
        double avg=0;
        for (int i = 1; i<=number;i++){
            sum = sum+i;
            System.out.println(sum);
        }
        avg = sum/number;
        System.out.println("The avg is "+ avg);
    }

}
class squre{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i<=number;i+=1 ){
            System.out.println("The sqaure of "+i +" is "  + i*i);
        }
    }
}

class uses_while_loop {
    public static void main(String[] args) {
        int i =1 ;
        Scanner scan =new  Scanner(System.in);
        System.out.print("Which number: ");
        int number = scan.nextInt();

        while (i<=10){
            System.out.println(number+ " x " +i +" = "+number*i);
            i++;
        }
    }
}

class avgwhile{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last number: ");
        int number = scan.nextInt();
        double sum = 0;
        double avg=0;
        int i = 1;
        while(i<=number){
            sum = sum+i;
            System.out.println(sum);
            i= i+1;
        }
        avg = sum/number;
        System.out.println("The avg is "+ avg);
    }

}

class squreWhile{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =1;
        int number = scan.nextInt();
        while( i<=number ){
            System.out.println("The sqaure of "+i +" is "  + i*i);
            i++;
        }
    }
}


class uses_do_while_loop {
    public static void main(String[] args) {
        int i =1 ;
        Scanner scan =new  Scanner(System.in);
        System.out.print("Which number: ");
        int number = scan.nextInt();
        do {
            System.out.println(number + " x " + i + " = " + number * i);
            i= i+1;
        }
        while (i<=10);
        }
}

class uses_do_while_loop_check {
    public static void main(String[] args) {
        int i =10 ;

        do {
            System.out.println("Hiii.....");
            i= i+1;
        }
        while (i<=10);
    }
}