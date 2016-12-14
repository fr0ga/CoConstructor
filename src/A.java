/**
 * Created by Andrey on 05.12.2016.
 */
public class A {

    public int x;
    public int y;
    public int z;

    A() {
        System.out.println("a1");
    }

    A(int x, int y) {
        this();
        this.x = 1;
        this.y = 2;
        System.out.println("a2");
    }

    A(int x, int y, int z)  {
        this(x, y);
        z = 2;
        System.out.println("a3");

    }
}

class B extends  A {

    public int p;
    public int m;
    public int n;

    B() {

        System.out.println("b1");
    }

    B (int p, int m) {
        this();
        System.out.println("b2");
    }

    B(int p, int m, int n)   {
        super(p, m, n);

        System.out.println("b3");
    }

}

class C extends B {

    public int k;
    public int f;
    public int h;

    C() {
        System.out.println("c1");
    }

    C (int k, int f) {
        System.out.println("c2");
    }

    C(int k, int f, int h) {
        super(k, f, h);
        System.out.println("c3");
    }

}
