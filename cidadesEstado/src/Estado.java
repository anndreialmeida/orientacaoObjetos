import java.util.ArrayList;

public class Estado {

    private String nome;
    private String sigla;

    private ArrayList<Cidade> listaCidades;

    public Estado() {
        this.listaCidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Cidade> getListaCidades() {
        return listaCidades;
    }

    public void setListaCidades(ArrayList<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
    }

    public String cidadeMaiorPopulacao(){
        int qtdPopulacao = 0;
        String nome = "";
        for (Cidade cidade: this.listaCidades) {
            if (cidade.getPopulacao() > qtdPopulacao){
                qtdPopulacao = cidade.getPopulacao();
                nome = cidade.getNome();
            }
        }

        return nome;
    }

    public int verficaClima(String clima) {
        int qtdCidades = 0;
        for (Cidade cidade: this.listaCidades) {
            if (cidade.getClima().equalsIgnoreCase(clima)){
                qtdCidades ++;
            }
        }

        return qtdCidades;
    }
    
    public float calculaMediaAreaCidades() {
        float total = 0;
        for (Cidade cidade: this.listaCidades){
            total +=  cidade.getArea();
        }


        return total/listaCidades.size();
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", listaCidades=" + listaCidades +
                '}';
    }
}
