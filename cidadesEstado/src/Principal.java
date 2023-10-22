public class Principal {
    public static void main(String[] args) {

        Estado estado = new Estado();

        estado.setNome("Santa Catarina");
        estado.setSigla("SC");

        Cidade cidade = new Cidade();
        cidade.setNome("Lages");
        cidade.setPopulacao(150000);
        cidade.setClima("tropical");
        cidade.setArea(50);
        estado.getListaCidades().add(cidade);

        cidade = new Cidade();
        cidade.setNome("Blumenau");
        cidade.setPopulacao(350000);
        cidade.setClima("tropical");
        cidade.setArea(30);
        estado.getListaCidades().add(cidade);

        cidade = new Cidade();
        cidade.setNome("Ponte Alta");
        cidade.setPopulacao(5000);
        cidade.setClima("tropical");
        cidade.setArea(20);
        estado.getListaCidades().add(cidade);

        // b) Crie um objeto do tipo estado e a ele associe diversas cidades. Após, mostre os dados do estado (ele deve mostrar também os dados das cidades associadas);
        System.out.println(estado.toString());

        // c) Para o estado criado, retorne qual é a cidade que possui a maior população;
        String nomeCidadeMaior = estado.cidadeMaiorPopulacao();
        System.out.println("Cidade com maior população é: " + nomeCidadeMaior);

        // d) Apresente quantas cidades possuem clima igual a nome do clima (temperado,
        //equatorial, tropical, etc). O nome do clima deve ser passado como parâmetro de
        //entrada;
        int totalCidadesClima = estado.verficaClima("TROPICAL");
        System.out.println(totalCidadesClima);

        //e) Mostre a média das áreas das cidades
        float mediaAreaCidades = estado.calculaMediaAreaCidades();
        System.out.println(mediaAreaCidades);










    }
}
