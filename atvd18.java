import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 75; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

        sc.close();
    }
}