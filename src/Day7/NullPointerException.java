package Day7;

public class NullPointerException {
    public static void main(String[] args) {
        try{
            String s = null;
            String s1 = "Nick";
            if(s.equals(s1)) {
                System.out.println("Equal");
            }
        } catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
