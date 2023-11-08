import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Andrei Almeida");

        Bike bike = new Bike();
        bike.setCodigo("10");
        bike.setTotalMarchas(12);
        bike.setDataCompra(LocalDate.of(2019, 11, 21));
        bike.setVelocidadeFinal(50);
        pessoa.getListaBikes().add(bike);

        bike = new Bike();
        bike.setCodigo("201020");
        bike.setTotalMarchas(24);
        bike.setDataCompra(LocalDate.of(2018, 10, 15));
        bike.setVelocidadeFinal(60);
        pessoa.getListaBikes().add(bike);

        bike = new Bike();
        bike.setCodigo("45809010");
        bike.setTotalMarchas(5);
        bike.setDataCompra(LocalDate.of(2013, 02, 05));
        bike.setVelocidadeFinal(40);
        pessoa.getListaBikes().add(bike);

        //b) Apresente o nome da pessoa e todos os dados das bikes associados a pessoa em questão;
        System.out.println(pessoa.toString());

        //c) Informe quantas bikes possuem total de marchas maior que 5;
        int quantidadeMarchas = 5;
        int qtdBikesPorNumeroMarchas = pessoa.getListaBikesPorMarcha(quantidadeMarchas);
        System.out.println("Total de bikes que possuem mais de 5 marchas:");
        System.out.println(qtdBikesPorNumeroMarchas);

        //d) Apresente a bike, com todos os seus dados, que possui a maior velocidade final;
        Bike bikeMaiorVelocidade = pessoa.getBikeMaiorVelocidade();
        System.out.println("Bike com Maior Velocidade: ");
        System.out.println(bikeMaiorVelocidade.toString());

        //e) Crie e apresente uma lista contendo os dados (Todos) das bikes que foram compradas antes de 20/11/2019
        LocalDate dataCompra = LocalDate.of(2019,11,20);
        ArrayList<Bike> listaBikesFiltroPorDataCompra = pessoa.getlistaBikesPorDataCompra(dataCompra);

        System.out.println("Bikes com data de compra anterior a " + dataCompra + ":");
        for (Bike listaBikes : listaBikesFiltroPorDataCompra ) {
            System.out.println(listaBikes.toString());
        }

        //f) Crie um metodo na classe pessoa que faça a pesquisa por uma bike, informe como parametro
        // da pesquisa o codigo da bike. Caso ela exista, mostre todos os seus dados.
        String codigoBike = "10";
        Bike bikeFiltroCodigo = pessoa.getBikePorCodigo(codigoBike);
        System.out.println("Filtra bike por código: ");
        System.out.println(bikeFiltroCodigo.toString());


        // ----------------------------  Usando o metodo Sream para fazer os filtros ----------------------------------
        // C-a) Informe quantas bikes possuem total de marchas maior que 5. Utilizando Stream();
        int totalMarcharStream = 10;
        Long totalBikesStream = pessoa.getRetornaTotalDeBikesPorNumeroDeMarcha(totalMarcharStream);
        System.out.println("Metodo Stream: Total de Bikes:  " + totalBikesStream);


        //C-a) Usando Stream Apresente a bike, com todos os seus dados, que possui a maior velocidade final;
        bike = pessoa.getBikeQuePossuiMarioVelocidadeFinal();
        System.out.println("Bike Com maior velocidade de acordo como metodo Stream: ");
        System.out.println(bike.toString());

        // Usando Stream, aprensete a bike que possui o maior numero.
        bike = pessoa.retornaBikeComMaiorCodigo();
        System.out.println("Bike com maior código: " + "\n" + bike.toString());

        //Usando Strem, retorn todas as bikes que possuem os numeros informados no campo codigo.
        String codigo = "10";
        ArrayList<Bike> bikePorCodigos =  pessoa.retornaBikesQuePossuemCodigo(codigo);

        if (!bikePorCodigos.isEmpty()) {
            System.out.println("Bike encontrada: " + bikePorCodigos);
        } else {
            System.out.println("Nenhuma bike encontrada com o código " + codigo);
        }









    }
}
