import java.util.Scanner;

public class atv34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = sc.nextInt();

        System.out.print("Digite o número de horas/aula: ");
        int horas = sc.nextInt();

        double valorHora = 0;

        switch (nivel) {
            case 1:
                valorHora = 12.00;
                break;
            case 2:
                valorHora = 17.00;
                break;
            case 3:
                valorHora = 25.00;
                break;
            default:
                System.out.println("Nível inválido.");
                sc.close();
                return;
        }

        double salario = horas * valorHora;
        System.out.println("Salário do professor: R$ " + salario);

        sc.close();
    }
}