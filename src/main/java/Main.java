import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = input.nextLine();
        char[] result = string.toCharArray();
        System.out.println("Reversed String Is:");
        for (int i = result.length-1; i>=0; i--)
            System.out.print(result[i]);
    }
}
