public class Even_or_not {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(11));
    }
}







//    public static void isEven(int n){
//         if (n % 2 ==0){
//             System.out.println("Even");
//         }
//     System.out.println("Not Even");
//     }
//     public static void main(String[] args) {
//         isEven(11);
//     }