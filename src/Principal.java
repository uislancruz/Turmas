public class Principal {
    public static void main(String[] args) {

        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessor = "Tia maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joao";
        aluno1.idade = 3;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Laura";
        aluno2.idade = 4;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Miguel";
        aluno3.idade = 3;

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);
        turmaB.adicionarAluno(aluno3);

        turmaB.removerAluno(1);

        turmaB.imprimirListaDeAlunos();

//        Comentando essa parte para fazer um metodo dentro da classe Turma, para ficar mais limpo

//        for (int i = 0; i < turmaB.alunos.length; i++) {
//            if (turmaB.alunos[i] != null) {
//                System.out.printf("%d - %s (%d anos)%n", i, turmaB.alunos[i].nome, turmaB.alunos[i].idade);
//            }else {
//                System.out.printf("%d Vago", i);
//            }
//        }
    }
}
