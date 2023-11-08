public class Bike {
    private int totalMarchas;
    private String tamanho;

    public Bike() {
    }

    public Bike(int totalMarchas, String tamanho) {
        this.totalMarchas = totalMarchas;
        this.tamanho = tamanho;
    }

    public int getTotalMarchas() {
        return totalMarchas;
    }

    public void setTotalMarchas(int totalMarchas) {
        this.totalMarchas = totalMarchas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void frear(){
        System.out.println("Freando o veiculo");
    }

    public void empinar(){
        System.out.println("Empinando Bike");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "totalMarchas=" + totalMarchas +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
