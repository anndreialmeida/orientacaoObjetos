import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("Ciência da Computação");

        Professor professor = new Professor();
        professor.setNome("João Silva");
        professor.setTitulacao("Doutorado");
        curso.listaProfessores.add(professor);

        professor = new Professor();
        professor.setNome("Julio de Lima");
        professor.setTitulacao("Mestrado");
        curso.listaProfessores.add(professor);

        professor = new Professor();
        professor.setNome("Claudia Diaz");
        professor.setTitulacao("Doutorado");
        curso.listaProfessores.add(professor);

        Aluno aluno = new Aluno();
        aluno.setNome("Cezar Luis");
        aluno.setCidade("Blumenau");
        curso.listaAlunos.add(aluno);

        aluno = new Aluno();
        aluno.setNome("Roberta Muniz");
        aluno.setCidade("Lages");
        curso.listaAlunos.add(aluno);

        aluno = new Aluno();
        aluno.setNome("Andrei Almeida");
        aluno.setCidade("Lages");
        curso.listaAlunos.add(aluno);

        aluno = new Aluno();
        aluno.setNome("Gilberto Vaz");
        aluno.setCidade("Florianopolis");
        curso.listaAlunos.add(aluno);


        System.out.println(curso.toString());

        // a) Mostre o total de alunos associados ao curso;
        int totalAlunosCurso = curso.getTotalDeAlunos();
        System.out.println("Total de Alunos no curso de: " + curso.getNome() + ": "+ totalAlunosCurso);

        //b) Mostre o total de professores associados ao curso;
        int totalProfessoresCurso = curso.getTotalProfessores();
        System.out.println("Total de Professores no curso de: " + curso.getNome() + ": "+ totalProfessoresCurso);

        //c) Crie uma lista dos alunos que não moram em Lages;
        String cidade = "Lages";
        ArrayList<Aluno> alunosFiltoPorCidade = curso.getListaAlunosExcluindoCidade(cidade);
        System.out.println("Lista dos alunos que não moram em: " + cidade );
        for (Aluno alunosFiltro: alunosFiltoPorCidade) {
            System.out.println(alunosFiltro.toString());
        }

        //d) Mostre o total de professores com titulação igual a doutorado.
        String titulo = "Doutorado";
        int totalProfessoresPorTitulo=  curso.getListaProfessoresPorTitulo(titulo);
        System.out.println("Total de professsores com titulo = " + titulo  + ": " + totalProfessoresPorTitulo);



    }
}
