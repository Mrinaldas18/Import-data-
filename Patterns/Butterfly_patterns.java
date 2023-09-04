public class Butterfly_patterns {
    public static void patterns(int rows) {
        for (int i = 1; i <= rows; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // spaces
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print("   ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print( " * ");
            }
            // spaces
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print("   ");
            }
            // Stars
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