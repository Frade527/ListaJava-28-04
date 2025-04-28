import java.util.Scanner;

public class atv28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumentoTotal = 0;

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        for (int i = 1; i <= 584; i++) {
            System.out.println("\nFuncionário " + i + ":");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Salário atual: ");
            double salario = sc.nextDouble();

            double percentual = 0;
            if (salario < 3 * salarioMinimo) {
                percentual = 0.5;
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
                percentual = 0.2;
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
                percentual = 0.15;
            } else {
                percentual = 0.10;
            }

            double reajuste = salario * percentual;
            double novoSalario = salario + reajuste;

            System.out.println("Nome: " + nome);
            System.out.println("Reajuste: R$ " + reajuste);
            System.out.println("Novo salário: R$ " + novoSalario);

            aumentoTotal += reajuste;
        }

        System.out.println("\nTotal de aumento na folha de pagamento: R$ " + aumentoTotal);

        sc.close();
    }
}
