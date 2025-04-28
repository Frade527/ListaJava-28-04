import java.util.Scanner;

public class atv24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println("Positivo");
            } else if (num < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }