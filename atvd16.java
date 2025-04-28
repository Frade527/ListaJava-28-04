import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("Aluno: %s\n", nome);
        System.out.printf("Média: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media <= 5.0) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }

        sc.close();
    }
}
