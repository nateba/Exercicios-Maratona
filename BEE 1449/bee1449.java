import java.util.HashMap;
import java.util.Scanner;

public class bee1449 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            // Leitura de uma instância
            int M = sc.nextInt();
            int N = sc.nextInt();
            sc.nextLine();

            HashMap<String, String> dicionario = new HashMap<>();
            for (int j = 0; j < M; j++) {
                String japa = sc.nextLine().trim();
                String traducao = sc.nextLine().trim();
                dicionario.put(japa, traducao);
            }

            for (int j = 0; j < N; j++) {
                String linha = sc.nextLine().trim();
                String[] palavras = linha.split(" ");
                StringBuilder linhaTraduzida = new StringBuilder();
                for (String p : palavras) {
                    if (dicionario.containsKey(p)) {
                        linhaTraduzida.append(dicionario.get(p)).append(" ");
                    } else {
                        linhaTraduzida.append(p).append(" ");
                    }
                }
                System.out.println(linhaTraduzida.toString().trim());
            }

            System.out.println();
        }
        sc.close();
    }
}