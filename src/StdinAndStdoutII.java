import java.util.Scanner;

public class StdinAndStdoutII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        double d = input.nextDouble();
        input.skip("\\s"); //see the documentation for more information
        String s = input.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
