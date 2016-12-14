/**
 * Created by Andrey on 05.12.2016.
 */
public class CoConstructor {

    public static void main(String[] args) {

        A a = new A(1,2,3);
        System.out.println();
        // a1 a2 a3

        B b = new B(4,5,6);
        System.out.println();
        // a1 a2 a3 b3

        C c = new C();
        System.out.println();
        // a1 b1 c1

        C c3 = new C(1,2,3);
        // a1 a2 a3 b3 c3


    }
}
