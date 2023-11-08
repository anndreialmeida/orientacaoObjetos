public class Aluno {
    private String nome;
    private String matricula;
    private String sexo;

    public Aluno(String nome, String matricula, String sexo) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
