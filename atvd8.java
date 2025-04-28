import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotacaoDolar, quantidadeDolares, valorEmReais;
        
        System.out.print("Digite a cotação do dólar (R$): ");
        cotacaoDolar = entrada.nextDouble();

        
        System.out.print("Digite a quantidade de dólares disponíveis (US$): ");
        quantidadeDolares = entrada.nextDouble();

        valorEmReais = cotacaoDolar * quantidadeDolares;
    
        System.out.printf("Valor equivalente em reais: R$ %.2f%n", valorEmReais);

        entrada.close();
    }
}
