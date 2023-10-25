import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String sexo;
    private float salario;
    
    private ArrayList<Dependente> listaDependentes;

    public Funcionario() {
        this.listaDependentes = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public ArrayList<Dependente> getListaDependentes() {
        return listaDependentes;
    }

    public void setListaDependentes(ArrayList<Dependente> listaDependentes) {
        this.listaDependentes = listaDependentes;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", sexo=" + sexo + ", salario=" + salario + ", listaDependentes=" + listaDependentes + '}';
    }
    
}
