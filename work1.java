import java.util.*;

public class work1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbers.add(scan.nextInt());
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
        scan.close(); // Closing Scanner
    }
}
