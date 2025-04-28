
public class atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double distancia, combustivel, consumoMedio;
        
        System.out.print("Digite a distância total percorrida em km: ");
        distancia = scanner.nextDouble();

    
        System.out.print("Digite o total de combustível gasto (em litros): ");
        combustivel = scanner.nextDouble();
        
        if (combustivel > 0) {
            consumoMedio = distancia / combustivel;
            System.out.printf("O consumo médio do automóvel é: %.2f km/l%n", consumoMedio);
        } else {
            System.out.println("O total de combustível deve ser maior que zero.");
        }

        scanner.close();
    }
}
