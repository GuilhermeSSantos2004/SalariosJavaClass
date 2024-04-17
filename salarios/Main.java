public class Main{
    public static void main(String[] args) {
        System.out.println("teste");

        FuncionarioIntegral funcionarioIntegral = new FuncionarioIntegral("Guilherme", 19, 10000);
        FuncionarioPorHora funcionarioPorHora = new FuncionarioPorHora("Gabriel", 20, 0, 8, 130);
        Gerente gerente = new Gerente("Enricco", 20, 20000, 50000, 1000);

        System.out.println("Salário de " + funcionarioIntegral.getNome() + ": " + funcionarioIntegral.calcSalario());
        System.out.println("Salário de " + funcionarioPorHora.getNome() + ": " + funcionarioPorHora.calcSalario());
        System.out.println("Salário de " + gerente.getNome() + ": " + gerente.calcSalario());
    }
}
