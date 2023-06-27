import java.util.Scanner;
import java.util.Stack;

public class bee1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int vagoes = sc.nextInt(); // le numero d vagoes
            if (vagoes == 0) // se for 0 nao tem mais
                break;

            while (true) {
                int[] saida = new int[vagoes + 1]; // cria um vetor c posicoes mais 1
                saida[1] = sc.nextInt(); // pra ficar bonitin as posicoes e os valores dos vagoes começa do [1]
                if (saida[1] == 0) { // se for 0 da enter e vai pro proximo
                    System.out.println();
                    break;
                }

                for (int i = 2; i <= vagoes; i++) { // comeca a prencher o vetor a partir da posicao 2
                    saida[i] = sc.nextInt();
                }

                Stack<Integer> pilha = new Stack<>(); // cria uma pilha
                int j = 1; // começa no 1 o primeiro vagao
                pilha.push(j++); // coloca ele na pilha e dps incrementa
                boolean deu_errado = false;
                for (int i = 1; i <= vagoes; i++) { // roda no vagao
                    while (!pilha.isEmpty() && pilha.peek() != saida[i] && j <= vagoes) { // se a pilha nao estiver
                                                                                          // vazia e
                        // ao mesmo tempo o topo dla nao
                        // for igual ao vetor naqla certa
                        // posição e o j ainda ta dentro do
                        // numero d vagoes
                        pilha.push(j++); // ai vai adicionar o proximo vagao e incrementar dps
                    }
                    if (!pilha.isEmpty() && pilha.peek() == saida[i]) { // se a pilha nao estiver vazia e ao mesmo tempo
                                                                        // o primeiro elemento dela for igual ao vetor
                                                                        // naqla posicao
                        pilha.pop(); // manda ele embora
                    } else { // se nao entrar nessas duas situacoes ai nao funciona
                        System.out.println("No");
                        deu_errado = true;
                        break;
                    }
                }
                if (!deu_errado) {
                    System.out.println("Yes");
                }
            }
        }
    }
}