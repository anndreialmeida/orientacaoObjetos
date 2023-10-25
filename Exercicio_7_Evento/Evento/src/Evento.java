import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {

    private String nome;
    private ArrayList<Participante> listaParticipantes;
    private ArrayList<Palestrante> listaPalestrantes;

    public Evento() {
       this.listaParticipantes = new ArrayList<>();
       this.listaPalestrantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public ArrayList<Palestrante> getListaPalestrantes() {
        return listaPalestrantes;
    }

    public void setListaPalestrantes(ArrayList<Palestrante> listaPalestrantes) {
        this.listaPalestrantes = listaPalestrantes;
    }
    
    

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", listaParticipantes=" + listaParticipantes +
                ", listaPalestrantes=" + listaPalestrantes +
                '}';
    }

    public Integer getTotalPessoas() {
        int totalPessoas = 0 ;
        totalPessoas = getListaParticipantes().size() + getListaPalestrantes().size();
        return totalPessoas;
    }


    public ArrayList getListaParticipantesPorDataNascimento(LocalDate date) {
        ArrayList<Participante> participantes = new ArrayList<>();

        for (Participante participante: this.listaParticipantes) {
            if (participante.getDataNascimento().isBefore(date)){
                participantes.add(participante);
            }
        }

        return participantes;

    }

    public ArrayList<Palestrante> getListaPalestrantesPorSexo(String sexo) {
        ArrayList<Palestrante> palestrantesFiltroPorSexo = new ArrayList<>();

        for (Palestrante palestrante: this.listaPalestrantes){
            if (palestrante.getSexo().equalsIgnoreCase(sexo)){
                palestrantesFiltroPorSexo.add(palestrante);
            }

        }
        return palestrantesFiltroPorSexo;
    }
}
