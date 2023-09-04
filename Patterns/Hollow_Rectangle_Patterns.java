public class Hollow_Rectangle_Patterns {
    public static void patterns(int rows, int columns) {
        // outer loops
        for (int i = 1; i <= rows; i++) {
            // inner loops
            for (int j = 1; j <= columns; j++) {

                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns(4, 5);
    }
}