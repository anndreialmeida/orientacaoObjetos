import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        String dataNascimentoTXT = "23/02/1992";

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoTXT, formatterData);
        */

        Evento evento = new Evento();
        evento.setNome("TI - SC");

        Palestrante palestrante = new Palestrante();
        palestrante.setNome("Carlos Antunes");
        palestrante.setSexo("M");

        palestrante.setDataNascimento(LocalDate.of(1994,05,15));
        evento.getListaPalestrantes().add(palestrante);

        palestrante = new Palestrante();
        palestrante.setNome("Amanda Monteiro");
        palestrante.setSexo("F");
        palestrante.setDataNascimento(LocalDate.of(2002,10,28));
        evento.getListaPalestrantes().add(palestrante);

        Participante participante = new Participante();
        participante.setNome("Andrei Almeida");
        participante.setSexo("M");
        participante.setDataNascimento(LocalDate.of(1992,02,23));
        evento.getListaParticipantes().add(participante);

        participante = new Participante();
        participante.setNome("Carla Amaral");
        participante.setSexo("F");
        participante.setDataNascimento(LocalDate.of(2020,10,18));
        evento.getListaParticipantes().add(participante);

        participante = new Participante();
        participante.setNome("Luisa Mel");
        participante.setSexo("M");
        participante.setDataNascimento(LocalDate.of(1984,12,30));
        evento.getListaParticipantes().add(participante);

        participante = new Participante();
        participante.setNome("Mel");
        participante.setSexo("F");
        participante.setDataNascimento(LocalDate.of(2021,01,30));
        evento.getListaParticipantes().add(participante);

        System.out.println(evento.toString());

        //a) Mostre o total de participantes e palestrantes associados ao evento
        Integer totalPessoas = evento.getTotalPessoas();
        System.out.println("Total de Participantes e Palestrantes no Evento: " + totalPessoas);

        //b) Crie e apresente uma lista de participantes que nasceram antes de 03/10/2020;
        LocalDate dataLimite = LocalDate.of(2020,10,03);
        ArrayList <Participante> participantesMenoresQueDataLimite  = evento.getListaParticipantesPorDataNascimento(dataLimite);

        System.out.println("Participantes com data de nascimento anterior a " + dataLimite + ":");
        for (Participante participatesFiltro : participantesMenoresQueDataLimite ) {
            System.out.println(participatesFiltro.toString());
        }

        //c) Crie e apresente uma lista com palestrantes do sexo masculino.
        String sexo = "M";
        ArrayList<Palestrante> palestrantesPorSexo =  evento.getListaPalestrantesPorSexo(sexo);
        System.out.println("Palestrantes ordenados por sexo - " + sexo + ": ");
        for (Palestrante palestrantesFiltroSexo: palestrantesPorSexo){
            System.out.println(palestrantesFiltroSexo.toString());
        }



    }
}
