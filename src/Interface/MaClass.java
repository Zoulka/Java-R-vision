package Interface;

public class MaClass implements MonInterface {

        @Override
        public void a () {
            System.out.println("Class a");
        }

        @Override
        public void b () {
            System.out.println("Class b");
        }

        @Override
        public void c () {
            System.out.println("Class c");
        }
    public static void main(String[] args) {
MaClass obj = new MaClass();
obj.a();
obj.b();
obj.c();
    }

}