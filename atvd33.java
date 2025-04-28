import java.util.Scanner;

public class atv33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o primeiro lado: ");
        A = sc.nextInt();

        System.out.print("Digite o segundo lado: ");
        B = sc.nextInt();

        System.out.print("Digite o terceiro lado: ");
        C = sc.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os valores formam um triângulo.");

            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero.");
            } else if (A == B || B == C || A == C) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        sc.close();
    }
}