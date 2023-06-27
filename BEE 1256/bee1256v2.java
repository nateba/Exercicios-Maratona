import java.util.*;

public class bee1256v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casosTeste = sc.nextInt();

        for (int i = 0; i < casosTeste; i++) {
            int tamanhoHash = sc.nextInt();
            int numeros = sc.nextInt();

            int[] elementos = new int[numeros];

            // Armazenar os elementos que serão testados
            for (int j = 0; j < numeros; j++) {
                elementos[j] = sc.nextInt();
            }

            // Testar cada elemento para exibição
            for (int x = 0; x < tamanhoHash; x++) {
                System.out.print(x);

                for (int y = 0; y < numeros; y++) {
                    if ((elementos[y] % tamanhoHash) == x) {
                        System.out.print(" -> " + elementos[y]);
                    }
                }

                System.out.println(" -> \\");
            }

            if (i != casosTeste - 1) {
                System.out.println("");
            }
        }

        sc.close();
    }
}