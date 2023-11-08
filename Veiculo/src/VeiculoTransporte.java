import java.time.LocalDate;

public class VeiculoTransporte {
    private LocalDate dataFabricacao;
    private String cor;

    public VeiculoTransporte(LocalDate dataFabricacao, String cor) {
        this.dataFabricacao = dataFabricacao;
        this.cor = cor;
    }

    public VeiculoTransporte() {
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void acelerar (){
        System.out.println("Acelerando veiculo!");
    }

    public void frear(){
        System.out.println("Freando o veiculo");
    }

    @Override
    public String toString() {
        return "VeiculoTransporte{" +
                "dataFabricacao=" + dataFabricacao +
                ", cor='" + cor + '\'' +
                '}';
    }
}
