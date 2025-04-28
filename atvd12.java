import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double IMPOSTOS = 0.45;
        final double DISTRIBUIDOR = 0.28;


        System.out.print("Digite o custo de fábrica do carro (R$): ");
        double custoFabrica = scanner.nextDouble();

        
        double valorImpostos = custoFabrica * IMPOSTOS;

        
        double subtotal = custoFabrica + valorImpostos;

        
        double valorDistribuidor = subtotal * DISTRIBUIDOR;

        double custoConsumidor = subtotal + valorDistribuidor;

        
        System.out.println("\n--- CUSTO FINAL DO CARRO ---");
        System.out.printf("Custo de fábrica: R$ %.2f%n", custoFabrica);
        System.out.printf("Impostos (45%%): R$ %.2f%n", valorImpostos);
        System.out.printf("Distribuidor (28%%): R$ %.2f%n", valorDistribuidor);
        System.out.printf("Custo ao consumidor: R$ %.2f%n", custoConsumidor);

        scanner.close();
    }
}