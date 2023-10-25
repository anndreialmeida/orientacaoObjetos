import java.util.ArrayList;

public class Curso {
    private String nome;
    ArrayList<Aluno> listaAlunos;

    ArrayList<Professor> listaProfessores;

    public Curso() {
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
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

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(ArrayList<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }
    
    

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", listaAlunos=" + listaAlunos +
                ", listaProfessores=" + listaProfessores +
                '}';
    }

    public int getTotalDeAlunos() {
        return listaAlunos.size();
    }

    public int getTotalProfessores() {
        return listaProfessores.size();
    }

    public ArrayList<Aluno> getListaAlunosExcluindoCidade(String cidade) {
        ArrayList <Aluno> alunosFiltoPorCidade = new ArrayList<>();

        for (Aluno aluno: this.listaAlunos) {
            if (!aluno.getCidade().equalsIgnoreCase(cidade)){
                alunosFiltoPorCidade.add(aluno);
            }

        }


        return  alunosFiltoPorCidade;
    }

    public int getListaProfessoresPorTitulo(String titulo) {
        int totalProfessores = 0;

        for (Professor professor: this.listaProfessores) {
            if (professor.getTitulacao().equalsIgnoreCase(titulo)){
                totalProfessores ++;
            }
        }
        return  totalProfessores;
    }
}
