import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            double grausCelsius, grausFahrenheit;

            System.out.println("Digite a temperatura em graus Celsiu: ");
            grausCelsius = entrada.nextDouble();

        //Convertendo para Fahrenheit usando a fórmula: F = (9 * C + 160) / 5
        grausFahrenheit = (9 * grausCelsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + grausFahrenheit);

        entrada.close();

    }
    
}