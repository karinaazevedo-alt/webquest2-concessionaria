public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
        super(placa, marca, modelo, ano, valor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    @Override
    public double calcularIpva() {
        return getValor() * 0.035;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + " | Portas: " + numeroPortas + " (Carro)";
    }
}
