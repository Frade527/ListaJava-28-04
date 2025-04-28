import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite o sexo (M/F) da " + i + "ª pessoa: ");
            String sexo = sc.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo.equals("F")) {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido informado.");
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        sc.close();
    }
}