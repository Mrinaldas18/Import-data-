public class SubArray {
    public static void pairs(int number[]){
        for (int i = 0; i < number.length; i++){
            for (int j = i + 1; j < number.length; j++){
                for (int k = i; k <= j; k++){
                    System.out.print(number[k]);
                    System.out.print("");
                }
                 System.out.print(",");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2 ,4, 6, 8, 10};
        pairs(number);
    }
}
