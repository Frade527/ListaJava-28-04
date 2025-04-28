import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpar buffer

        int aptos = 0;
        int inaptos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = sc.nextLine().toUpperCase();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Saúde (B para Boa / R para Ruim): ");
            sc.nextLine(); // limpar buffer
            String saude = sc.nextLine().toUpperCase();

            if (sexo.equals("M") && idade >= 18 && saude.equals("B")) {
                System.out.println(nome + " está apto para o serviço militar.");
                aptos++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar.");
                inaptos++;
            }
        }

        System.out.println("Total de aptos: " + aptos);
        System.out.println("Total de inaptos: " + inaptos);

        sc.close();
    }
}
