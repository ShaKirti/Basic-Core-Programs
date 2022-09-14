public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 12, num2 = 24;
        System.out.println("Before Swapping");
        System.out.println("First number: "+num1+" , "+"Second number: "+num2);

        // first, we declare a variable where we can assign value of num1 so that we assign value of num2 to num1
        int temp = num1;

        // Value of num2 is assigned to num1 variable
        num1 = num2;

        // Now value of temp is assigned to num2
        num2 = temp;

        System.out.println("After Swapping");
        System.out.println("First number: "+num1+" , "+"Second number: "+num2);
    }
}
