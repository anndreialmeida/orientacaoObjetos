/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculasalario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alunolages
 */
public class salario {

    private float salario;
    private String nome;
    LocalDate dataNascimento;
    private float salarioLiquido;

    public salario(String nome, float salario, LocalDate dataNascimento) {
        this.salario = salario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private float descontoPrevidencia() {
        float descontoPrevidencia = this.salario * 10 / 100;
        return descontoPrevidencia;
    }

    private float descontoImposto() {
        float descontoImposto = this.salario * 5 / 100;
        return descontoImposto;
    }

    public void calculaSalarioLiquido() {
        this.salarioLiquido = salario;
        float descontoPrevidencia = descontoPrevidencia();
        float descontoImposto = descontoImposto();
        this.salarioLiquido -= descontoPrevidencia + descontoImposto;
    }

    @Override
    public String toString() {
         DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoTXT = this.dataNascimento.format(formatterData);
        return "salario{" + "salario=" + salario + ", nome=" + nome + ", dataNascimento=" + dataNascimentoTXT + ", salarioLiquido=" + salarioLiquido + '}';
    }

  

}
