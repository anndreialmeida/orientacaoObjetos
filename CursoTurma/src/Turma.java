import java.util.ArrayList;

public class Turma {

    private String nome;
    private ArrayList<Aluno> listaAlunos;

    public Turma(){
        this.listaAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", listaAlunos=" + listaAlunos +
                '}';
    }
}
