import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "abc";
        List<String> anagramas = new ArrayList<>();
        gerarAnagramas(input.toCharArray(), 0, anagramas);

        System.out.println("Anagramas: " + anagramas);
    }

    private static void gerarAnagramas(char[] letras, int index, List<String> resultados) {
        if (index == letras.length - 1) {
            resultados.add(new String(letras));
            return;
        }

        for (int i = index; i < letras.length; i++) {
            trocar(letras, index, i);
            gerarAnagramas(letras, index + 1, resultados);
            trocar(letras, index, i);
        }
    }

    private static void trocar(char[] letras, int i, int j) {
        char temp = letras[i];
        letras[i] = letras[j];
        letras[j] = temp;
    }
}