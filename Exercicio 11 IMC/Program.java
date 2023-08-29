import javax.swing.*;

public class Program {
    public static void main(String[] args) {


        String pesoTxt = JOptionPane.showInputDialog("Digite o seu peso: ");
        float peso = Float.valueOf(pesoTxt);

        String alturaTxt = JOptionPane.showInputDialog("Digite sua altura: ");
        float altura = Float.valueOf(alturaTxt);



        Imc pessoa1 = new Imc(peso, altura);

        pessoa1.calculaImc();

        JOptionPane.showMessageDialog(null, pessoa1);


        String pesoTxt2 = JOptionPane.showInputDialog("Digite o seu peso: ");
        float peso2 = Float.valueOf(pesoTxt2);

        String alturaTxt2 = JOptionPane.showInputDialog("Digite sua altura: ");
        float altura2 = Float.valueOf(alturaTxt2);



        Imc pessoa2 = new Imc(peso2, altura2);

        pessoa2.calculaImc();

        JOptionPane.showMessageDialog(null, pessoa2);



        String pesoTxt3 = JOptionPane.showInputDialog("Digite o seu peso: ");
        float peso3 = Float.valueOf(pesoTxt3);

        String alturaTxt3 = JOptionPane.showInputDialog("Digite sua altura: ");
        float altura3 = Float.valueOf(alturaTxt3);



        Imc pessoa3 = new Imc(peso3, altura3);

        pessoa3.calculaImc();

        JOptionPane.showMessageDialog(null, pessoa3);

    }
}
