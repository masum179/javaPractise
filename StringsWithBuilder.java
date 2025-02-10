import java.util.*;

public class StringsWithBuilder {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        //String name = scan.nextLine();
        String name= "Mozammal Hossain" ;
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb);
        for (int i = 0 ; i<sb.length();i++){
            System.out.println("Char at "+i+" th index is "+name.charAt(i));
        }
        sb.setCharAt(1, 'A');
        System.out.println(sb);
        StringBuilder asu = sb.insert(0,"S");
        System.out.println(asu);
        asu.delete(0,1);
        System.out.println(asu);
        sb.append(" Masum");
        System.out.println(sb);
    }
}