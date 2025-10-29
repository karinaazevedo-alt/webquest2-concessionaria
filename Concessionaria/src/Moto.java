public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    @Override
    public double calcularIpva() {
        return getValor() * 0.025;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + " | Cilindradas: " + cilindradas + " (Moto)";
    }
}
