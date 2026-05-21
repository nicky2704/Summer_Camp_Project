package Day4;

public class ReverseOfString {
    public static void main(String[] args) {
        String s = new String("meme");
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
