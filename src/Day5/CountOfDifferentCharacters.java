package Day5;

public class CountOfDifferentCharacters {
    public static void solution(String s){
        s = s.toLowerCase();

        String vowels = "aeiou";
        String decimals = "1234567890";
        String specialCharacters = "!@#$%^&*()";

        int vowelsCount = 0;
        int decimalsCount = 0;
        int consonentCount = 0;
        int specialCharCount = 0;

        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(vowels.contains(Character.toString(ch))) {
                vowelsCount++;
            }else if(decimals.contains(Character.toString(ch))) {
                decimalsCount++;
            }else if(specialCharacters.contains(Character.toString(ch))) {
                specialCharCount++;
            }else{
                consonentCount++;
            }
        }
        System.out.println("Vowels Count : " + vowelsCount);
        System.out.println("Consonents Count : " + consonentCount);
        System.out.println("Decimals Count : " + decimalsCount);
        System.out.println("Special Characters Count : " + specialCharCount);
    }
    public static void main(String[] args) {
        String s = "aghjfhuyuqiiodhfg132436@#$";

        solution(s);
    }
}
