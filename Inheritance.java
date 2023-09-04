public class Inheritance {
    class a{
        void run (){
            System.out.println("We are the warrior");
        }
    }
    class b extends a{
        void display(){
            System.out.println("HAHA");
        }
    }
    public static void main(String[] args) {
        b obj = new b ();
        obj.run();
        obj.display();
    }
}
