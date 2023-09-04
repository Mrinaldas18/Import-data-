public class Rhombus_patterns {
    public static void patterns(int rows) {
        for (int i = 1; i <=rows; i++){
            // spaces
            for (int j = 1; j <= rows-i; j++){
                System.out.print("   ");
            }
                // stars
                for (int j = 1; j <= rows; j++){
                    System.out.print(" * ");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns(4);
    }
}
