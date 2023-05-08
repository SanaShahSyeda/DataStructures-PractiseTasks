
import java.util.Scanner;

public class Clap_Task {
    public static boolean checkSeven(int i) {
        int n = i;
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            if (temp==7) {
                return true;
            }
            n=n/10;
        }
        return false;
    }

     public static boolean sumDivisibleBySeven(int i) {
        int n = i;
        int temp = 0;
        int sum=0;
        while (n > 0) {
            temp = n % 10;
            sum=sum+temp;
            n=n/10;
        }
        if(sum%7==0){
           return true; 
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter digit to play game  upto that number= ");
        int N = scan.nextInt();
        for (int i = 1; N >= i; i++) {
            if (i % 7 == 0 || checkSeven(i) || sumDivisibleBySeven(i) ) {
                System.out.println("Clap !!");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
