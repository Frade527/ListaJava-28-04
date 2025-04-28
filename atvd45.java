public class atv45 {

    // Função para calcular X elevado a Z
    public static double calcularPotencia(double X, int Z) {
        double resultado = 1;
        
        // Calculando X^Z manualmente
        for (int i = 1; i <= Z; i++) {
            resultado *= X;
        }
        
        return resultado;
    }

    public static void main(String[] args) {
         
        double X = 5;  // Valor base
        int Z = 3;     // Expoente

        
        double resultado = calcularPotencia(X, Z);
        System.out.println(X + " elevado a " + Z + " é: " + resultado);
    }
}

