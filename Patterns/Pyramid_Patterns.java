public class Pyramid_Patterns {
    public static void patterns(int rows, int columns) {
        // outer loops
        for (int i = rows; i >= 1; i--) {
            // inner loops
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns(4, 4);
    }



    // Print the Pattern:-
    //-->
    // public static void patterns (int rows, int columns){
    // //outer loops
    // for (int i = 1; i <= rows; i++){
    // //inner loops
    // for (int j = 1; j <= i; j++){
    // System.out.print(" * ");
    // }
    // System.out.println();
    //    }
    // }

    // public static void main(String[] args) {
    // patterns (4,4);
    // }

}

