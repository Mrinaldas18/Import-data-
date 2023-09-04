public class NestedClass {
    public static void main(String[] args) {
        class a {

            void show(){
                System.out.println("cgu");
            }
            class b{
                void run(){
                    System.out.println("bbsr");
                }
            }
            class test{
                public static void main(String[] args) {
                 a obj = new a ();
                 obj.show();
                 a.b obj1 = obj.new b();
                 obj1.run();   
                }
            }
        }
    }
}
