public class atv44 {
    // Função para calcular o valor de S com fatorial
    public static double calcularS(int N) {
        double S = 1;
        
        for (int i = 1; i <= N; i++) {
            S += 1.0 / fatorial(i);
        }
        
        return S;
    }
    
    // Função para calcular o fatorial de um número
    public static int fatorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}