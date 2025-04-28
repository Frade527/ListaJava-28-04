import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalCusto = 0;
        double totalVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.print("Digite o preço de custo do " + i + "º produto: ");
            double precoCusto = sc.nextDouble();

            System.out.print("Digite o preço de venda do " + i + "º produto: ");
            double precoVenda = sc.nextDouble();

            totalCusto += precoCusto;
            totalVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Prejuízo");
            } else {
                System.out.println("Empate");
            }
        }

        double mediaCusto = totalCusto / 40;
        double mediaVenda = totalVenda / 40;

        System.out.printf("Média de preço de custo: R$ %.2f\n", mediaCusto);
        System.out.printf("Média de preço de venda: R$ %.2f\n", mediaVenda);

        sc.close();
    }
}
