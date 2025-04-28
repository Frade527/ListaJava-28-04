public class atv41 {
    // Função para verificar se um número é perfeito
    public static boolean verificarNumeroPerfeito(int numero) {
        int somaDivisores = 0;
        
        // Calcula a soma dos divisores
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        
        // Verifica se a soma dos divisores é igual ao número
        return somaDivisores == numero;
    }
}