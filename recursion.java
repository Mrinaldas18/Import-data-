class recursion{
    public static int printNumber (int n){
        if(n==1){
            return 1;
        }
        int fact = printNumber(n-1);
        int factorial = n * fact;
        return factorial;
    }
    
        public static void main(String[] args) {
            int n = 10;
            int ans = printNumber(n);
            System.out.println(ans);
        }





    //     if(n == 6){
    //     return;
    //     }
      
    //     System.out.println(n);
    //     printNumber (n+1);
    // }
    // public static void main(String[] args) {
    //     int n=1;
    //     printNumber(n);
    // }
}