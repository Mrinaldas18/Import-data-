public class Inverted_pyramid {
    public static void patterns(int n) {
       
        // outer loops
        for (int i = 1; i <= n; i++) {
            
            // For spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

                //For Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns(4);
    }
}
