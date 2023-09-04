public class Inverted_Reverse_patterns {
    public static void inverted_reverse (int rows){
            for (int i = rows; i >= 1; i--){
                int num = 1;
                for (int j = 1; j <= i; j++) {
                   System.out.print(num + " ");
                   num++;
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            inverted_reverse(5);
        }
}
