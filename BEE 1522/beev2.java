import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beev2 {

    public static int jogoDasPilhas(List<List<Integer>> pilhas) {
        // Verifica se o jogo é possível de ser vencido
        for (List<Integer> pilha : pilhas) {
            int soma = pilha.stream().mapToInt(Integer::intValue).sum();
            if (soma % 3 != 0) {
                return 0;
            }
        }

        // Remove as cartas das pilhas até que todas sejam removidas
        while (true) {
            int pilhasVazias = 0;

            // Verifica se todas as pilhas estão vazias
            for (List<Integer> pilha : pilhas) {
                if (pilha.isEmpty()) {
                    pilhasVazias++;
                }
            }

            if (pilhasVazias == pilhas.size()) {
                return 1;
            }

            // Remove as cartas que formam uma soma múltipla de 3
            for (List<Integer> pilha : pilhas) {
                if (!pilha.isEmpty()) {
                    for (int j = 1; j <= Math.min(3, pilha.size()); j++) {
                        List<Integer> cartasRemovidas = pilha.subList(0, j);
                        int soma = cartasRemovidas.stream().mapToInt(Integer::intValue).sum();
                        if (soma % 3 == 0) {
                            pilha.subList(0, j).clear();
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(); // Número de cartas em cada pilha
            if (n == 0) {
                break;
            }

            List<List<Integer>> pilhas = new ArrayList<>();

            // Lê as pilhas de cartas
            for (int i = 0; i < n; i++) {
                List<Integer> cartas = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    cartas.add(scanner.nextInt());
                }
                pilhas.add(cartas);
            }

            int resultado = jogoDasPilhas(pilhas);
            System.out.println(resultado);
        }

        scanner.close();
    }
}