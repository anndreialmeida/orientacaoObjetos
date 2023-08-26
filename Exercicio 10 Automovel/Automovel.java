package Automovel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Automovel {

    String marca;
    Integer quilometragemInicial;
    Integer quilometragemFinal;
    Float litrosConsumidos;
    LocalDate dataFabricacaoVeiculo;
    Integer capacidadeTanqueCombustivel;


    public Automovel(String marca, Integer quilometragemInicial, Integer quilometragemFinal, Float litrosConsumidos, LocalDate dataFabricacaoVeiculo, Integer capacidadeTanqueCombustivel) {
        this.marca = marca;
        this.quilometragemInicial = quilometragemInicial;
        this.quilometragemFinal = quilometragemFinal;
        this.litrosConsumidos = litrosConsumidos;
        this.dataFabricacaoVeiculo = dataFabricacaoVeiculo;
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public Automovel() {

    }

    public String getMarca() {
        return marca;
    }

    public Integer getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public Integer getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public Float getLitrosConsumidos() {
        return litrosConsumidos;
    }

    public LocalDate getDataFabricacaoVeiculo() {
        return dataFabricacaoVeiculo;
    }

    public Integer getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuilometragemInicial(Integer quilometragemInicial) {
        if(quilometragemInicial > 0){
            this.quilometragemInicial = quilometragemInicial;
        }

    }

    public void setQuilometragemFinal(Integer quilometragemFinal) {
        if (quilometragemFinal > 0  && quilometragemFinal > this.quilometragemInicial){
            this.quilometragemFinal = quilometragemFinal;
        }

    }

    public void setLitrosConsumidos(Float litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }

    public void setDataFabricacaoVeiculo(LocalDate dataFabricacaoVeiculo) {
        this.dataFabricacaoVeiculo = dataFabricacaoVeiculo;
    }

    public void setCapacidadeTanqueCombustivel(Integer capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public Float calculaConsumoMedioCombustivel (){

        float consumoMedio = (this.quilometragemFinal - this.quilometragemInicial) / this.litrosConsumidos;

        return  consumoMedio;
    }

    public Float calculaAutonomia(){
        Float autonomia = calculaConsumoMedioCombustivel()  * (this.capacidadeTanqueCombustivel  - this.litrosConsumidos);

        return autonomia;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoTXT = this.dataFabricacaoVeiculo.format(formatterData);
        return "Automovel: " +
                "\nMarca: " + marca +
                "\nKM Inicial: " + quilometragemInicial +
                "\nKM Final: " + quilometragemFinal +
                "\nlitros Consumidos: " + litrosConsumidos +
                "\nData de Fabricacão do Veiculo: " + dataNascimentoTXT +
                "\nCapacidade do Tanque de Combustivel: " + capacidadeTanqueCombustivel + " Litros" +
                "\nConsumo Médio: "  + calculaConsumoMedioCombustivel() + " KM/L" +
                "\nAutonomia do Veiculo: " + calculaAutonomia() + " KM";



    }
}
