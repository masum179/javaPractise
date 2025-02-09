import java.util.*;
public class Strings {
    public static void main(String[] args) {
        //Concatenation mean jora lagano
        Scanner sc = new Scanner(System.in);
        //String firstName = sc.next();
        //String lastName = sc.next();
        String firstName ="Mozammal";
        String lastName = "Masum";
        //System.out.println(firstName+lastName);
        String fullName =firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        System.out.println(fullName.charAt(0));
        for (int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        // s1> s2 = +ve
        //s1==s2 = 0
        //s1<s2 = -ve
        //compare to


        //if (fullName==firstName){
        //    System.out.println("Strings ar equal");
        //}
       // else {
        //    System.out.println("Strings are not equal");
        //}


        if(new String("Masum")==(new String("Masum"))){
            System.out.println("Strings are equal ");
        }
        else {
            System.out.println("Strings are not equal");
        }
        String myName ="MozammalHossain";
        String name = myName.substring(2);
        String myFirstName = myName.substring(0,8);
        System.out.println(myFirstName);

    }
}