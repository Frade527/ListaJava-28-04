import java.util.Scanner;

public class atv32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, resultado = 0;
        char operador;

        System.out.print("Digite o primeiro número (A): ");
        A = sc.nextDouble();

        System.out.print("Digite o segundo número (B): ");
        B = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = sc.next().charAt(0);

        boolean operadorValido = true;

        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operadorValido = false;
                }
                break;
            default:
                System.out.println("Operador não definido!");
                operadorValido = false;
        }

        if (operadorValido) {
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}