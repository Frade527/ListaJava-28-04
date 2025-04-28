import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto (R$): ");
        double precoCusto = scanner.nextDouble();

        
        System.out.print("Digite o percentual de acréscimo (%): ");
        double percentualAcrescimo = scanner.nextDouble();

        
        double valorAcrescimo = precoCusto * (percentualAcrescimo / 100);

        
        double precoVenda = precoCusto + valorAcrescimo;

        
        System.out.printf("O preço de venda do produto é: R$ %.2f%n", precoVenda);

        scanner.close();
    }
}
