
import java.util.ArrayList;


public class Empresa {
    private String nome;
    private ArrayList<Funcionario> listaFuncionarios;

    public Empresa() {
        this.listaFuncionarios = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", listaFuncionarios=" + listaFuncionarios + '}';
    }

    public int totalFuncionario(String sexo) {
        int total = 0;
        for (Funcionario funcionario : this.listaFuncionarios) {
            if (funcionario.getSexo().equalsIgnoreCase(sexo)) {
                total++;
            }
        }
        return total;
    }

    public int totalDependenteFuncionario(String nomeFuncionario) {
        
        int totalDependentes = 0;
        for (Funcionario funcionario : this.listaFuncionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nomeFuncionario)) 
                return totalDependentes = funcionario.getListaDependentes().size();
        }
        
        return totalDependentes;
        
    }

    public float CalculeMediaSalario() {
        
        float soma = 0;
        for (Funcionario funcionario : this.listaFuncionarios) {
            soma = soma + funcionario.getSalario();
        }
        return soma / this.listaFuncionarios.size();
    }
    
}
