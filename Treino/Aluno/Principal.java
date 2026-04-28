public class Principal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Carlos", "99999-1234", new Data(10, 5, 2000), "RA001");
        Aluno a2 = new Aluno("Maria", new Data(15, 8, 2002), "RA002");

        Funcionario f1 = new Funcionario("João", "88888-5678", new Data(20, 3, 1985), 1001, 4500.00);
        Funcionario f2 = new Funcionario("Ana", new Data(5, 11, 1990), 1002, 6000.00);

        System.out.println("===== ALUNO 1 =====");
        System.out.println(a1);

        System.out.println("\n===== ALUNO 2 =====");
        System.out.println(a2);

        System.out.println("\n===== FUNCIONÁRIO 1 =====");
        System.out.println(f1);

        System.out.println("\n===== FUNCIONÁRIO 2 =====");
        System.out.println(f2);
    }
}
