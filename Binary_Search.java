public class Binary_Search {
    public static int binary_search(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        for (; start <= end;) {
            // mid
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }

            else if (number[mid] < key) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 4;
        System.out.println(binary_search(number, key));
    }
}
