/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajusteprojeto;

import javax.swing.JOptionPane;
import jdk.dynalink.beans.StaticClass;

/**
 *
 * @author alunolages
 */
public class Program {

    public static void main(String args[]) {
        Banco conta = new Banco("Andrei", "123456", 180);

        conta.depositar(20);

        conta.sacar(100);
        JOptionPane.showMessageDialog(null, conta);

    }

}
