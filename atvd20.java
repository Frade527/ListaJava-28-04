import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carrosAte2000 = 0;
        int totalCarros = 0;
        String continuar;

        do {
            System.out.print("Digite o valor do carro: ");
            double valorCarro = sc.nextDouble();

            System.out.print("Digite o ano do carro: ");
            int ano = sc.nextInt();

            double desconto = (ano <= 2000) ? valorCarro * 0.12 : valorCarro * 0.07;
            double valorFinal = valorCarro - desconto;

            if (ano <= 2000) {
                carrosAte2000++;
            }
            totalCarros++;

            System.out.printf("Desconto: R$ %.2f\n", desconto);
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorFinal);

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            sc.nextLine(); // Limpar o buffer
            continuar = sc.nextLine().toUpperCase();

        } while (!continuar.equals("N"));

        System.out.println("Total de carros até 2000: " + carrosAte2000);
        System.out.println("Total de carros: " + totalCarros);

        sc.close();
    }
}
