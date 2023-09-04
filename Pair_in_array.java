public class Pair_in_array {
    public static void pairs(int number[]){
        int Tp = 0;
        for (int i = 0; i < number.length; i++){
            for (int j = i + 1; j < number.length; j++){
                System.out.print("(" + number[i] + "," + number[j] + ")");
                Tp++;
            }
            System.out.println();
        }
         System.out.println(Tp);
    }
    public static void main(String[] args) {
        int number[] = {2 ,4, 6, 8, 10};
        pairs(number);
    }
}
