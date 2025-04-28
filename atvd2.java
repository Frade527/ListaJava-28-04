
public class atv2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, soma, subtracao, divisao, multiplicacao;

        System.out.println("Digite o primeiro número");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        divisao = num2 != 0 ? num1 / num2 : Double.NaN;
        multiplicacao = num1 * num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração:" + subtracao);
        System.out.println("Multiplicação:" + multiplicacao);

        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: Não é possível dividir por zero.");
        }
    
        entrada.close();

    }


    
}
