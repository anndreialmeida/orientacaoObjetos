import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Pessoa {
    private String nome;
    private ArrayList<Bike> listaBikes;

    public Pessoa() {
        this.listaBikes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bike> getListaBikes() {
        return listaBikes;
    }

    public void setListaBikes(ArrayList<Bike> listaBikes) {
        this.listaBikes = listaBikes;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", listaBikes=" + listaBikes +
                '}';
    }

    public int getListaBikesPorMarcha(int quantidadeMarchas) {
        int totalBikes = 0;
        for (Bike bike : listaBikes) {
            if (bike.getTotalMarchas() > quantidadeMarchas) {
                totalBikes++;
            }
        }

        return totalBikes;
    }

    public Bike getBikeMaiorVelocidade() {
        float velocidadeFinal = 0;
        Bike bikeVelocidade = new Bike();
        for (Bike bike : listaBikes) {
            if (bike.getVelocidadeFinal() > velocidadeFinal) {
                velocidadeFinal = bike.getVelocidadeFinal();
                bikeVelocidade = bike;
            }

        }
        return bikeVelocidade;
    }

    public ArrayList<Bike> getlistaBikesPorDataCompra(LocalDate dataCompra) {
        ArrayList<Bike> listaBike = new ArrayList<>();
        for (Bike bike : this.listaBikes) {
            if (bike.getDataCompra().isBefore(dataCompra)) {
                listaBike.add(bike);
            }
        }
        return  listaBike;
    }

    public Bike getBikePorCodigo(String codigoBike) {
        for(Bike bike: this.listaBikes){
            if(bike.getCodigo().equalsIgnoreCase(codigoBike)){
                return bike;
            }
        }
        return null;
    }

    public long getRetornaTotalDeBikesPorNumeroDeMarcha(int totalMarcharStream) {
        return listaBikes.stream().filter(bike -> bike.getTotalMarchas() > totalMarcharStream).count();

    }


    public Bike getBikeQuePossuiMarioVelocidadeFinal() {
        return listaBikes.stream().max(Comparator.comparing(Bike::getVelocidadeFinal)).orElse(null);
    }

    public Bike retornaBikeComMaiorCodigo() {
        return listaBikes.stream().max(Comparator.comparing(Bike::getCodigo)).get();
    }

    public ArrayList<Bike> retornaBikesQuePossuemCodigo(String codigo) {
        return (ArrayList<Bike>) listaBikes.stream().filter(bike -> bike.getCodigo().contains(codigo)).collect(Collectors.toList());
    }
}
