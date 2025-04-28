import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorDepositado, rendimento, valorFinal;

        final double TAXA_JUROS = 0.007;

        
        System.out.print("Digite o valor depositado (R$): ");
        valorDepositado = entrada.nextDouble();
        
        rendimento = valorDepositado * TAXA_JUROS;

        valorFinal = (valorDepositado + rendimento);

        System.out.printf("Valor após um mês com rendimento: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}
