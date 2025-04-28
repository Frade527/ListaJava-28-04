
public class atv1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        soma = num1 + num2;
    
        System.out.println("A soma dos dois números é: " + soma);

        entrada.close();

    }

}