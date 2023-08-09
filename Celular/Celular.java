/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author alunolages
 */
public class Celular {
    
    private int idCelular;
    private String marca;
    private String modelo;
    private String memoriaRam;
    private Float armazenamento; 
    
    public Celular (){
        
    }
    
    
    public Celular( int idCelular, String marca, String modelo, String memoriaRam, float armazenamento){
        this.idCelular = idCelular;
        this.marca = marca; 
        this.modelo = modelo; 
        this.memoriaRam =  memoriaRam;
        this.armazenamento = armazenamento; 
    }
    
    public boolean validaNumero(String variavel){
         boolean isNumeric = (variavel != null && variavel.matches("[0-9]+"));
         
         return isNumeric;
    }
    
    public int getIdCelular(){
        return idCelular;
    }
    public void setIdCelular(int idCelular){
        this.idCelular =  idCelular;
    }
    
    public String getMarca(){
        return marca; 
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMemoriaRam(){
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    
    public float getArmazenamento(){
        return armazenamento;
    }
    public void setArmazenamento(float armazenamento){
        this.armazenamento = armazenamento;
    }
    
    public static void Ligar (){
        for (int i = 0; i < 10; i++) {
            System.out.println("Ligando!!!");
        }
    }
    
    public static void Desligar (){
        System.out.println("Desligando!");
    }
    
    public static void evniarMensagem(){
        System.out.println("Mensgem enviada!");
    }
    
    
}
