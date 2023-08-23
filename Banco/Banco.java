/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajusteprojeto;

/**
 *
 * @author alunolages
 */
public class Banco {

    private String nome;
    private String numeroConta;
    private double saldo;

    public Banco(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        setSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public void depositar(double valor) {
        if (saldo >= 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            double valorIOF = calcularIOF(valor);

            if (getSaldo() >= valor + valorIOF) {
                this.saldo -= valor + valorIOF;
            }
        }
    }

    private double calcularIOF(double valor) {
        double valorIOF = valor * 1 / 100;
        if (valorIOF > 5) {
            valorIOF = 5;
        }

        return valorIOF;

    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n Numero da Conta: " + numeroConta + "\n Saldo: " + saldo;
    }

}
