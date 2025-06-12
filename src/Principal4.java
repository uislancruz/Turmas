import java.util.Arrays;

public class Principal4 {

        public static void main(String[] args) {
            int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
            int[] numerosNovoJogo = new int[numerosJogoAtual.length -1];

            System.out.println(Arrays.toString(numerosJogoAtual));
            System.out.println(Arrays.toString(numerosNovoJogo));
        }
    }
