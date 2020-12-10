import java.util.Scanner;

public class LoopsI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Please input one number");
        int N = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<=10; i++){
            num = N*i;
            System.out.println(num);

        }
    }
}
