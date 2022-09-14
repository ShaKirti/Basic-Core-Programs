import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet to check vowel or consonant:");
        char ch = 'a';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch+" is vowel");
        else
            System.out.println(ch+" is consonant");
    }
}
