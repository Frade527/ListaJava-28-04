import java.util.Scanner;

public class atv36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de cliente (1-Residência, 2-Comércio, 3-Indústria): ");
        int tipoCliente = sc.nextInt();

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        double consumo = sc.nextDouble();

        double valorKw = 0;

        switch (tipoCliente) {
            case 1:
                valorKw = 0.60;
                break;
            case 2:
                valorKw = 0.48;
                break;
            case 3:
                valorKw = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                sc.close();
                return;
        }

        double valorConta = consumo * valorKw;
        System.out.println("Valor da conta de luz: R$ " + valorConta);

        sc.close();
    }
}
