import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Given the number Factorial is " + n + "!=" + result);
    }
}
