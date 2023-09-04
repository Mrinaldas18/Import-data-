public class Diamond_Patterns {
    public static void diamond(int rows){
        for (int i = 1; i <= rows; i++){
            // spaces
            for (int j = 1; j <= rows - i; j++){
                System.out.print("   ");
            }
            // stars
            for (int j = 1; j <= (2 * i) -1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--){
            // spaces
            for (int j = 1; j <= rows - i; j++){
                System.out.print("   ");
            }
            // stars
            for (int j = 1; j <= (2 * i) -1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(4);
    }
}

