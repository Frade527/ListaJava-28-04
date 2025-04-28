public class atv31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numeros[1] = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        numeros[2] = sc.nextInt();

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        sc.close();
    }
}