public class Largest_number {
    public static int largest_no(int number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 1 };
        System.out.println(largest_no(number));
    }
}
