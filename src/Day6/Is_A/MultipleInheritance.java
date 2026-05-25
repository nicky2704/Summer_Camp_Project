package Day6.Is_A;

class A {
    public void m1() {
        System.out.println("m1 in class A");
    }
}

class B {
    public void m1() {
        System.out.println("m1 in class B");
    }
}
//class can not inherite more than one class 
//class C extends A,B{

//}

//ALternate way to implement multiple inheritance
interface X {
    public void n1();
}
interface Y{
    public void n1();
}
//class C implements A,B{
    //public void m1() {
        //System.out.println("m1");
    //}
//}
public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
}
