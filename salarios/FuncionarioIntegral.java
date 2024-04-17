class FuncionarioIntegral extends Funcionario {
    private double salario;

    public FuncionarioIntegral(String nome,int idade, double salario) {
        super(nome, idade, salario);
        this.salario = salario;
    }
    @Override
    public double calcSalario(){
        return salario;
    }
}