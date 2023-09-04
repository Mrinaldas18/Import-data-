import java.util.Scanner;
class Calculator{
    static int mrinal(int num1,int num2,String operator){
        return (num1 + num2);
}

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        String operator=obj.next();
        System.out.println(+mrinal(num1,num2,operator));
    }

















    // public static void main(String[] args) {
    //     int num1,num2,result;
    //     Scanner obj= new Scanner(System.in);
    //     System.out.println("Enter the 1st number");
    //     num1= obj.nextInt();
    //     System.out.println("Enter the 2nd number");
    //     num2= obj.nextInt();
    //     System.out.println("Enter the operator");
    //     String operator= obj.next();

    //     switch(operator){
    //         case "+":
    //         result = num1 + num2;
    //         System.out.println(num1 + "+" + num2 + "=" + result );
    //         break;
    //         case "-":
    //         result = num1 - num2;
    //         System.out.println(num1 + "-" + num2 + "=" + result );
    //         break;
    //         case "*":
    //         result = num1 * num2;
    //         System.out.println(num1 + "*" + num2 + "=" + result );
    //         break;
    //         case "/":
    //         result = num1 / num2;
    //         System.out.println(num1 + "/" + num2 + "=" + result );
    //         break;
    //         default:
    //         System.out.println("Invalid");
    //     }
    // }
}