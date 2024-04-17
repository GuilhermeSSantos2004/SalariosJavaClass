class Gerente extends Funcionario {
    private double salarioBase;
    private double bonusDesempenho;

    public Gerente(String nome, int idade, double salario, double salarioBase, double bonusDesempenho) {
        super(nome, idade, salarioBase);
        this.salarioBase = salarioBase;
        this.bonusDesempenho = bonusDesempenho;
    }

    @Override
    public double calcSalario() {
        return salarioBase + bonusDesempenho;
    }

}