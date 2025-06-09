public class Principal {
    public static void main(String[] args) {

        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessor = "Tia maria";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Joao";
        turmaB.alunos[0].idade = 3;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        turmaB.alunos[1] = aluno1;

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
