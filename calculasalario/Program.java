/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculasalario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolages
 */
public class Program {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Entre com o nome: ");
        String salarioBrutoTXT = JOptionPane.showInputDialog("Digite o salario Bruto: ");
        float salarioBruto = Float.valueOf(salarioBrutoTXT);
        String dataNascimentoTXT = JOptionPane.showInputDialog("Digite a data de nascimento:(dd/mm/aaaa) ");
        
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoTXT, formatterData);
        
        
        salario funcionario = new salario(nome, salarioBruto,dataNascimento );
        funcionario.calculaSalarioLiquido();
        JOptionPane.showMessageDialog(null, funcionario);
        
        
    }
}
