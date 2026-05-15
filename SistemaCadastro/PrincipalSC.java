package SistemaCadastro;

public class PrincipalSC {
    public static void main(String[] args) {
        DataSC data1 = new DataSC(15, 8, 1990);
        DataSC data2 = new DataSC(12, 9, 1985);
        DataSC data3 = new DataSC(10, 10, 2000);
        PessoaSC pessoa1 = new PessoaSC("João", "1234-5678", data1);
        PessoaSC pessoa2 = new PessoaSC("Maria", data2);
        PessoaSC pessoa3 = new PessoaSC("Carlos", data3);
        FuncionarioSC funcionario1 = new FuncionarioSC(1001, 5000.0, "Ana", "9876-5432", data1);
        FuncionarioSC funcionario2 = new FuncionarioSC(1002, 6000.0, "Pedro", data2);
        AlunoSC aluno1 = new AlunoSC("Lucas", "4321-8765", data3, "2023001");
        AlunoSC aluno2 = new AlunoSC("Sofia", data1, "2023002");
        AlunoSC aluno3 = new AlunoSC("Mariana", data2, "2023003");
        AlunoSC aluno4 = new AlunoSC("Rafael", "9999-9999", data3, "2023004");
        System.out.println(pessoa1);
        System.out.println("-----------------------------");
        System.out.println(pessoa2);
        System.out.println("------------------------------");
        System.out.println(pessoa3);
        System.out.println("------------------------------");
        System.out.println(funcionario1);
        System.out.println("------------------------------");
        System.out.println(funcionario2);
        System.out.println("------------------------------");
        System.out.println(aluno1);
        System.out.println("------------------------------");
        System.out.println(aluno2);
        System.out.println("------------------------------");
        System.out.println(aluno3);
        System.out.println("------------------------------");
        System.out.println(aluno4); // A ideia é que a gente cria objetos novos e os exibe com o System.out.println, para mostrar que os objetos estão sendo criados corretamente e que os métodos toString estão funcionando como esperado.
    }
}
