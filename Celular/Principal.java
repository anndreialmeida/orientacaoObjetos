/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author alunolages
 */
public class Principal {
    
    public static void main (String args[] ){
        Celular celular1 = new Celular(01, "Iphone", "12", "8 GB", 120);
        
        
        
        System.out.println("Dados do Celular: " +  "\n" + 
                "Id do Celular: " + celular1.getIdCelular() + "\n" +
                "Marca: " + celular1.getMarca() + "\n" + 
                "Modelo: " + celular1.getModelo() + "\n" + 
                "Memoria Ram: " + celular1.getMemoriaRam() + " GB" + "\n" +
                "Armazenamento: " + celular1.getArmazenamento()
                );
        
        celular1.Ligar();
        celular1.Desligar();
        celular1.evniarMensagem();
    }
    
}
