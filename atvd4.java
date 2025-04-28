
public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite o salário fixo do vendedor (R$): ");
        double salarioFixo = scanner.nextDouble();

        
        System.out.print("Digite o total de vendas efetuadas no mês (R$): ");
        double totalVendas = scanner.nextDouble();

        
        double comissao = totalVendas * 0.15;

        
        double salarioFinal = salarioFixo + comissao;

        
        System.out.println("\n--- RESUMO DO PAGAMENTO ---");
        System.out.println("Nome do vendedor: " + nome);
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Comissão sobre vendas: R$ %.2f%n", comissao);
        System.out.printf("Salário final do mês: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
