package Automovel;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        String marca = JOptionPane.showInputDialog("Informe a maraca do veiculo: ");
        String quilometragemInicialTxt = JOptionPane.showInputDialog("Informe a quilometragem inicial do Veiculo: ");
        Integer quilometragemInicial = Integer.valueOf(quilometragemInicialTxt);
        String quilometragemFinalTxt = JOptionPane.showInputDialog("Informe a quilometragem final do veiculo: ");
        Integer quilometragemFinal = Integer.valueOf(quilometragemFinalTxt);
        String litrosConsumidosTxt = JOptionPane.showInputDialog("Informe quantos litros foram consumidos: ");
        Float litrosConsumidos = Float.valueOf(litrosConsumidosTxt);
        String dataFabricacaoVeiculoTxt = JOptionPane.showInputDialog("Informe a data de fabricação do veiculo: (dd/mm/aaaa)");
        String capacidadeTanqueCombustivelTxt = JOptionPane.showInputDialog("Informe a capacidade do tanque de combustivel: ");
        Integer capacidadeTanqueCombustivel = Integer.valueOf(capacidadeTanqueCombustivelTxt);





        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFabricacao = LocalDate.parse(dataFabricacaoVeiculoTxt, formatterData);


        Automovel carro = new Automovel(marca, quilometragemInicial, quilometragemFinal , litrosConsumidos, dataFabricacao, capacidadeTanqueCombustivel);

        carro.calculaConsumoMedioCombustivel();
        carro.calculaAutonomia();

        JOptionPane.showMessageDialog(null, carro);






    }
}
