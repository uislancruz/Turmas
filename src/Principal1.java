import java.util.ArrayList;

public class Principal1 {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");
//        alunos[0] = "Joao";
//        alunos[1] = "Laura";

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);

        }
    }
}
