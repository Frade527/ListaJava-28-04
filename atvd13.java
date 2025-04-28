import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;

        System.out.println("Digite um número");
        numero = entrada.nextDouble();

        if (numero > 10) { System.out.print("Este número é maior que 10");
            
        }

        entrada.close();
    }
    
}
