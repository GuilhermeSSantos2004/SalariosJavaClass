public class FuncionarioPorHora extends Funcionario {
    private int horas;
    private double valorHora;

    public FuncionarioPorHora(String nome, int idade, double salario, int horas, double valorHora) {
        super(nome, idade, 0);
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public void setHorasTrabalhadas(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcSalario(){
        return horas * valorHora;
    }

}