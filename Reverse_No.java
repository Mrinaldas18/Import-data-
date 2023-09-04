public class Reverse_No {
    public static int[] rev_no(int number[]) {
        int first = 0;
        int last = number.length - 1;

        for (; first < last;) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
        return number;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        rev_no(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
