public class Reverses {
    public static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int reversedValue = reverse(2345);
        System.out.println(reversedValue);
    }
}
