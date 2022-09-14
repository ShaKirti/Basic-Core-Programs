import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd:");
        int num = sc.nextInt();

        if (num%2==0)
            System.out.println("The given number is even.");
        else
            System.out.println("The given number id odd.");
    }
}
