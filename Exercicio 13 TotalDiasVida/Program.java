import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        String dataNascimentoTXT = JOptionPane.showInputDialog("Digite a data de nascimento:(dd/mm/aaaa) ");
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento  = LocalDate.parse(dataNascimentoTXT,formatterData);

        TotalDias diasNascimento = new TotalDias(dataNascimento);

        diasNascimento.calculaDiasNascimento();

        JOptionPane.showMessageDialog(null, diasNascimento);
    }
}
