import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 80) {
            System.out.println("Número maior que 80.");
        } else if (numero < 25) {
            System.out.println("Número menor que 25.");
        } else if (numero == 40) {
            System.out.println("Número igual a 40.");
        }

        sc.close();
    }
}