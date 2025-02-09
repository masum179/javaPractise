import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Arrays{
    public static void main(String[] arsg) {
        int [] marks =new int[3];
        marks[0]=10;
        marks[1] =60;
        marks[2]=80;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for (int i = 0; i< marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}

class DirArray {
    public static void main(String[] args) {
        int roll[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i< roll.length;i++){
            System.out.println("The number in "+i+"th index is " +roll[i]);
        }
    }
}

class InputSize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: ");
        int len = sc.nextInt();
        int [] number = new int[len];
        for (int i = 0; i<len;i++){
            System.out.println(number[i]);

        }
    }
}
class inputInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        int len = sc.nextInt();
        int arr []= new int[len];
        System.out.println("Input array's element");
        for (int i=0; i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Print array's element");
        for (int i = 0; i<len; i++){
            System.out.println(arr[i]);
        }
    }
}

class Task{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input len: ");
        int len = sc.nextInt();
        int arr [] = new int[len];
        System.out.println("Input");
        for (int i = 0; i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number which you want to search");
        int x = sc.nextInt();
        System.out.println("Output");
        for (int i = 0; i< arr.length;i++) {
            if (arr[i] == x) {
                System.out.println(i);
                break;
            }
        }
    }
}