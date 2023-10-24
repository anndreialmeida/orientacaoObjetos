import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Palestrante {

    private String nome;
    private LocalDate dataNascimento;
    private String sexo;

    public Palestrante() {

    }

    public Palestrante(String nome, LocalDate dataNascimento, String sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoTXT = this.dataNascimento.format(formatterData);
        return "Palestrante{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimentoTXT +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
