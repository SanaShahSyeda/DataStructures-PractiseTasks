
import java.util.Scanner;

public class ClinkingGlass {

    public int clink(int n) {
        int result = 0;
        for (int i = 1; n > i; i++) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        ClinkingGlass obj = new ClinkingGlass();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of guests= ");
        int n = scan.nextInt();
        System.out.println("\nNo: of times glasses have been clinked= " + obj.clink(n));
    }
}
