import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double valorCompra, valorPrestacao;
        
        System.out.print("Digite o valor total da compra (R$): ");
        valorCompra = scanner.nextDouble();

    
        valorPrestacao = valorCompra / 5;
        
        System.out.printf("O valor de cada uma das 5 prestações é: R$ %.2f%n", valorPrestacao);

        scanner.close();
    }
}