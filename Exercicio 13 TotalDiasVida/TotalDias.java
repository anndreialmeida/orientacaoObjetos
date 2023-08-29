import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TotalDias {

    private LocalDate dateNow = LocalDate.now();
    private LocalDate dataNasc;
    private long days;


    public TotalDias(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public LocalDate getDateNow() {
        return dateNow;
    }

    public void setDateNow(LocalDate dateNow) {
        this.dateNow = dateNow;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void calculaDiasNascimento() {
        days = ChronoUnit.DAYS.between(this.dataNasc, this.dateNow);

    }

    @Override
    public String toString() {

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoTXT = this.dataNasc.format(formatterData);
        String dataHoje =  this.dateNow.format(formatterData);

        return "Data Nascimento: " + dataNascimentoTXT + "\n" +
                "Data de Hoje: " + dataHoje + "\n" +
                "Dias de Vida: " + this.days;
    }
}
