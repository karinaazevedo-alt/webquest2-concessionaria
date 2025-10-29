import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC1D23", "Ford", "Fiesta", 2020, 45000.0, 4));
        veiculos.add(new Carro("DEF4G56", "Volkswagen", "Golf", 2022, 85000.0, 4));
        veiculos.add(new Carro("GHI7J89", "Chevrolet", "Onix", 2023, 65000.0, 4));
        veiculos.add(new Moto("JKL0M12", "Honda", "CG 160", 2021, 12000.0, 160));
        veiculos.add(new Moto("MNO3P45", "Yamaha", "MT-03", 2023, 25000.0, 321));
        veiculos.add(new Caminhao("PQR6S78", "Volvo", "FH 540", 2022, 350000.0, 18.5));
        veiculos.add(new Caminhao("STU9V01", "Mercedes", "Actros", 2023, 420000.0, 4.5));

        System.out.println("=== CONCESSIONÁRIA - RELATÓRIO DE VEÍCULOS ===");
        System.out.println("Total de veículos: " + veiculos.size());
        System.out.println("\n--- DETALHES DOS VEÍCULOS ---");

        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println((i + 1) + ". " + veiculos.get(i).exibirInformacoes());
        }

        double ipvaTotal = 0;
        for (Veiculo veiculo : veiculos) {
            ipvaTotal += veiculo.calcularIpva();
        }
        System.out.printf("\nIPVA TOTAL DA FROTA: R$ %.2f\n", ipvaTotal);
    }
}
