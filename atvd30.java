import java.util.Scanner;

public class atv30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        char sexo;
        double salarioFixo;
        double abono = 0;
        double salarioLiquido;

        // Entrada de dados
        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        idade = sc.nextInt();

        System.out.print("Digite o sexo do funcionário (M/F): ");
        sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário fixo do funcionário: ");
        salarioFixo = sc.nextDouble();

        // Cálculo do abono
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.0;
            } else {
                abono = 50.0;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 200.0;
            } else {
                abono = 80.0;
            }
        } else {
            System.out.println("Sexo inválido! Informe apenas M ou F.");
            sc.close();
            return; // encerra o programa
        }

    
        salarioLiquido = salarioFixo + abono;

    
        System.out.println("\n--- Resultado ---");
        System.out.println("Nome do Funcionário: " + nome);
    }
}