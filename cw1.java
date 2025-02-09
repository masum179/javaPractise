import java.util.*;
public class cw1 {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       int size = scan.nextInt();
       List<Integer> numbers = new ArrayList();
       for (int i = 0;i<size;i++){
           int n = scan.nextInt();
           numbers.add(n);
       }
       int sum =0;
       for (int i=0;i<numbers.size();i++ ){
           sum+= numbers.get(i);
       }

    }
}