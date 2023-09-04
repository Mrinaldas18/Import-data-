public class Hollow_Rhombus_Patterns {
    public static void patterns(int rows) {
        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }

            // stars
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns(4);
    }
}
