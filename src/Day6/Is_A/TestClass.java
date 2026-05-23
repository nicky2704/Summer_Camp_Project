package Day6.Is_A;

public class TestClass {
    public static void main(String[] args) {
        //case 1
        C c1 = new C();
        c1.m1();
        c1.m2();

        //case 2
        P p2 = new P();
        p2.m1();
        //p2.m2(); //not valid

        //case 3
        P p1 = new C();
        p1.m1();
        //p1.m2(); //not valid

        //case 4
        //C c2 = new P(); //not valid
    }
}
