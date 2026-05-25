package Day7;

public class NewArithmeticException {
    public static void main(String[] args) {
        int n = 200;
        try{
            if(n > 35) {
                throw new java.lang.ArithmeticException("> 35");
            }
            System.out.println("<35");
        } catch (java.lang.ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
