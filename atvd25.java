import java.util.Scanner;

public class atv25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (num1 > num2) {
                System.out.println("O primeiro número (" + num1 + ") é maior.");
            } else {
                System.out.println("O segundo número (" + num2 + ") é maior.");
            }
        }

        sc.close();
    }
}
