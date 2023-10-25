public class Dependente {
    private String nome;
    private String sexo;

    public Dependente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dependente{" + "nome=" + nome + ", sexo=" + sexo + '}';
    }
    
}
