public class atv43 {
    // Função para calcular a tabuada de um número com um operador
    public static void calcularTabuada(int N, String O, int T) {
        System.out.println("Tabuada de " + N + " com operador " + O + " até " + T);
        
        for (int i = 1; i <= T; i++) {
            if (O.equalsIgnoreCase("Soma")) {
                System.out.println(N + " " + O + " " + i + " = " + (N + i));
            } else if (O.equalsIgnoreCase("Subtracao")) {
                System.out.println(N + " " + O + " " + i + " = " + (N - i));
            } else if (O.equalsIgnoreCase("Multiplicacao")) {
                System.out.println(N + " " + O + " " + i + " = " + (N * i));
            } else if (O.equalsIgnoreCase("Divisao")) {
                System.out.println(N + " " + O + " " + i + " = " + (N / (double) i));
            } else {
                System.out.println("Operador inválido");
            }
        }
    }
}