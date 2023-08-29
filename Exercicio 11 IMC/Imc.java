import javax.swing.*;

public class Imc {

    private float peso;
    private float altura;
    private float imc;

    public Imc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    public void calculaImc() {

        this.imc = this.peso / (this.altura * this.altura);
    }

    @Override
    public String toString() {

        if (this.imc < 18.5) {
            return "IMC: " + this.imc + " MAGREZA";

        }

        if (this.imc > 18.5 && this.imc < 24.9) {
            return "IMC: " + this.imc + " NORMAL";
        }
        if (this.imc > 25 && this.imc < 29.9) {
            return "IMC: " + this.imc + " SOBREPESO";
        }

        if (this.imc > 30 && this.imc < 39.9) {
            return "IMC: " + this.imc + " OBESIDADE";
        }

        return "IMC: " + this.imc + " OBESIDADE GRAVE";



    }
}
