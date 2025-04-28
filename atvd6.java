public class atv6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B;

        System.out.println("digite o valor de A: ");
        A = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
        B= entrada.nextInt();

        //valores antes da troca
        System.out.println("Antes da troca: A é: " + A + ", B = " + B);

        //para trocar os valores
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Depois da troca: A é: " + A + ", B = " + B);

        entrada.close();

    }
}
