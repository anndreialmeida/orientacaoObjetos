
public class Main {
    
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        empresa.setNome("Empresa 1");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Funcionario1");
        funcionario.setSalario(100);
        funcionario.setSexo("masculino");
        
        Dependente dependente = new Dependente();
        dependente.setNome("Dependente1_Funcionario1");
        dependente.setSexo("masculino");
        funcionario.getListaDependentes().add(dependente);
        
        dependente = new Dependente();
        dependente.setNome("Dependente2_Funcionario1");
        dependente.setSexo("feminino");
        funcionario.getListaDependentes().add(dependente);

        empresa.getListaFuncionarios().add(funcionario);
        
        funcionario = new Funcionario();
        funcionario.setNome("Funcionario2");
        funcionario.setSalario(200);
        funcionario.setSexo("feminino");
        
        dependente = new Dependente();
        dependente.setNome("Dependente1_Funcionario2");
        dependente.setSexo("feminino");
        funcionario.getListaDependentes().add(dependente);
        
        dependente = new Dependente();
        dependente.setNome("Dependente2_Funcionario2");
        dependente.setSexo("feminino");
        funcionario.getListaDependentes().add(dependente);
        
        empresa.getListaFuncionarios().add(funcionario);
        
        System.out.println(empresa.toString());
        
        // c) Para uma dada empresa, mostre o total funcionários sexo igual a feminino;
        int total = empresa.totalFuncionario("masculino");
        System.out.println("Total de masculinos: " + total);
        
        // d) Para uma dada empresa e para um dado funcionário, 
        //    informe a quantidade de dependentes associados ao funcionário;
        int totalDependentes = empresa.totalDependenteFuncionario("Funcionario1");
        System.out.println("Total dependentes: " + total);
        
        // e) Apresente o salário médio dos funcionários de uma empresa.
        float mediaSalario = empresa.CalculeMediaSalario();
        System.out.println("Media dos salarios: " + mediaSalario);
        
    }
    
}
