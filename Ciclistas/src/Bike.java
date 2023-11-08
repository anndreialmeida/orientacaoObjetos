import java.time.LocalDate;

public class Bike {

    private String codigo;
    private int totalMarchas;
    private LocalDate dataCompra;
    private float velocidadeFinal;


    public Bike() {
    }

    public Bike(String codigo, int totalMarchas, LocalDate dataCompra, float velocidadeFinal) {
        this.codigo = codigo;
        this.totalMarchas = totalMarchas;
        this.dataCompra = dataCompra;
        this.velocidadeFinal = velocidadeFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTotalMarchas() {
        return totalMarchas;
    }

    public void setTotalMarchas(int totalMarchas) {
        this.totalMarchas = totalMarchas;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(float velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "codigo='" + codigo + '\'' +
                ", totalMarchas=" + totalMarchas +
                ", dataCompra=" + dataCompra +
                ", velocidadeFinal=" + velocidadeFinal +
                '}';
    }
}
