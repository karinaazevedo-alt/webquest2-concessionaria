
public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }

    @Override
    public double calcularIpva() {
        return capacidadeCarga <= 5 ? getValor() * 0.02 : getValor() * 0.03;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + " | Carga: " + capacidadeCarga + " ton (Caminhão)";
    }
}
