public class atv42 {
    // Função para ordenar 3 valores em ordem crescente
    public static int[] ordenarValores(int a, int b, int c) {
        int[] valores = {a, b, c};
        
        // Ordenação simples utilizando o método de ordenação
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    // Troca os valores
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        
        return valores;
    }
}