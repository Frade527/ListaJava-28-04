import java.util.Scanner;

public class atv39 {

    // Função para calcular a nota final e a classificação
    public static void calcularNotaFinal(String nome, String matricula, double notaTrabalho, double notaAvaliacao, double notaExame) {
        // Pesos para cada nota
        int pesoTrabalho = 2;
        int pesoAvaliacao = 3;
        int pesoExame = 5;

        // Calculando a média ponderada
        double notaFinal = (notaTrabalho * pesoTrabalho + notaAvaliacao * pesoAvaliacao + notaExame * pesoExame) / (pesoTrabalho + pesoAvaliacao + pesoExame);

        // Determinando a classificação com base na nota final
        String classificacao;
        if (notaFinal >= 8 && notaFinal <= 10) {
            classificacao = "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            classificacao = "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            classificacao = "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            classificacao = "D";
        } else {
            classificacao = "R";
        }

        // Imprimindo o resultado
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println(String.format("Nota final: %.2f", notaFinal));
        System.out.println("Classificação: " + classificacao);
    }

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando dados do estudante
        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota do trabalho de laboratório (0-10): ");
        double notaTrabalho = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral (0-10): ");
        double notaAvaliacao = scanner.nextDouble();

        System.out.print("Digite a nota do exame final (0-10): ");
        double notaExame = scanner.nextDouble();

    
        calcularNotaFinal(nome, matricula, notaTrabalho, notaAvaliacao, notaExame);

        
        scanner.close();
    }
}