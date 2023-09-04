import java.util.Scanner;

public class Multiplications {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    public static void printAdditionTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n + i;
            System.out.println(n + " + " + i + " = " + result);
        }
    }

    public static void printDivisionTable(int n) {
        for (int i = 1; i <= 10; i++) {
            double result = n / i;
            System.out.println(n + " / " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();
        
        System.out.println("Multiplication Table:");
        printMultiplicationTable(input);

        System.out.println("Addition Table:");
        printAdditionTable(input);

        System.out.println("Division Table:");
        printDivisionTable(input);
    }
}
