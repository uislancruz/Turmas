import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
    String identificacao;
    String nomeProfessor;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);

//        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
//        alunos[alunos.length -1] = aluno;
    }

    void removerAluno(int indice){
        alunos.remove(indice);
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
        }

//        for (Aluno aluno : alunos) {
//            if (aluno != null) {
//                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
//            } else {
//                System.out.println("Vago");
//            }
//        }
    }
}
