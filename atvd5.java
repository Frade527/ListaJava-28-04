public class atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeDoAluno;
        double nota1, nota2, nota3, media;

        System.out.println("Digite seu nome: ");
        nomeDoAluno = entrada.nextLine();

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno (a): " + nomeDoAluno);
        System.out.println("Média: " + media);

        entrada.close();

    }

    
}
