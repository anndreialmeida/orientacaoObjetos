import javax.swing.*;

public class Program {

    public static void main(String[] args) {
        String xTxt = JOptionPane.showInputDialog("Digite o valor do lado X: ");
        float x = Float.valueOf(xTxt);

        String yTxt = JOptionPane.showInputDialog("Digite o valor do lado Y: ");
        float y = Float.valueOf(yTxt);

        String zTxt = JOptionPane.showInputDialog("Digite o valor do lado Z: ");
        float z = Float.valueOf(zTxt);


        Triangulo t = new Triangulo(x, y, z);


        JOptionPane.showMessageDialog(null, t);





    }
}
