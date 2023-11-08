import java.util.ArrayList;
import java.util.Comparator;

public class Curso {
    private String nome;
    private ArrayList<Turma> listaTurmas;

    public Curso() {
        this.listaTurmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(ArrayList<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", listaTurmas=" + listaTurmas +
                '}';
    }

    public Aluno getListaDadosAluno(String nome, String matricula) {

        for (Turma turma : this.listaTurmas) {
            for (Aluno aluno: turma.getListaAlunos()){
                if(aluno.getNome().equalsIgnoreCase(nome) && aluno.getMatricula().equalsIgnoreCase(matricula)){
                    return aluno;
                }
            }
        }
        return null;
    }


}
