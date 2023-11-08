import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("Computação");

        Turma turma = new Turma();
        turma.setNome("Programação");


        Aluno aluno = new Aluno();
        aluno.setNome("Andrei Almeida");
        aluno.setSexo("Masculino");
        aluno.setMatricula("102030");
        turma.getListaAlunos().add(aluno);

        aluno = new Aluno();
        aluno.setNome("Maria ");
        aluno.setSexo("Feminino");
        aluno.setMatricula("102040");
        turma.getListaAlunos().add(aluno);

        aluno = new Aluno();
        aluno.setNome("Laura ");
        aluno.setSexo("Masculino");
        aluno.setMatricula("102050");
        turma.getListaAlunos().add(aluno);

        aluno = new Aluno();
        aluno.setNome("Marcos ");
        aluno.setSexo("Masculino");
        aluno.setMatricula("102099");
        turma.getListaAlunos().add(aluno);

        curso.getListaTurmas().add(turma);

        // ------------------- Nova Turma --------------------------- //

        Turma turma2 = new Turma();
        turma2.setNome("Banco de Dados");


        Aluno aluno2 = new Aluno();
        aluno2.setNome("Andrei Almeida");
        aluno2.setSexo("Masculino");
        aluno2.setMatricula("102030");
        turma2.getListaAlunos().add(aluno2);

        aluno2 = new Aluno();
        aluno2.setNome("Joana");
        aluno2.setSexo("Feminino");
        aluno2.setMatricula("1020900");
        turma2.getListaAlunos().add(aluno2);

        aluno2 = new Aluno();
        aluno2.setNome("Kali ");
        aluno2.setSexo("Feminino");
        aluno2.setMatricula("1020800");
        turma2.getListaAlunos().add(aluno2);

        curso.getListaTurmas().add(turma2);

        //b) Crie o curso, mostre as turmas e, para cada turma, os alunos associados;
        System.out.println(curso.toString());

        // d) Crie um método de pesquisa. Informe como parâmetro o nome da turma e a
        //matrícula do aluno. Caso o método encontre, apresente todos os dados do aluno;
        String nome = "Andrei Almeida";
        String matricula = "102030";
        Aluno alunoFiltrado = curso.getListaDadosAluno(nome, matricula);
        System.out.println(alunoFiltrado);


    }
}
