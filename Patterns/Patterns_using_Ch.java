public class Patterns_using_Ch {
    public static void patterns(int rows) {
                // outer loops
            for (int i = 1; i <= rows; i++) {
                // inner loops
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
                
                System.out.println();
                
            }
        }
    
        public static void main(String[] args) {
            patterns (4);
        }
}
