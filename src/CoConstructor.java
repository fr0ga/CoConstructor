/**
 * Created by Andrey on 05.12.2016.
 */
public class CoConstructor {

    public static void main(String[] args) {

        A a = new A(1,2,3);
        System.out.println();

        B b = new B(4,5,6);
        System.out.println();

        C c = new C();
        System.out.println();

        C c3 = new C(1,2,3);


    }
}