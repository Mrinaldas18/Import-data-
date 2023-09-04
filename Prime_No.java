// Check weather prime number or not -->
// import java.util.Scanner;
// class Prime_no {
//     public static boolean prime (int n){
//         for (int i = 2; i <= n-1; i++){
//             if (n % i == 0){
//                return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int das = sc.nextInt();
//         System.out.println(prime(das));
//     }
// }

// Check weather prime number or not -->
import java.util.Scanner;

class Prime_no {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime_in_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        prime_in_range(value);
    }
}