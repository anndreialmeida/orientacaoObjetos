public class Carro {

    private int capacidade;
    private float velocidadeFinal;

    public Carro() {
    }

    public Carro(int capacidade, float velocidadeFinal) {
        this.capacidade = capacidade;
        this.velocidadeFinal = velocidadeFinal;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public float getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(float velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    public void acelerar (){
        System.out.println("Acelerando veiculo!");
    }

    public void pagarImposto(){
        System.out.println("Imposto pago");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "capacidade=" + capacidade +
                ", velocidadeFinal=" + velocidadeFinal +
                '}';
    }
}
