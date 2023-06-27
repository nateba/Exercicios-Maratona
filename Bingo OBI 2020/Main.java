
import java.util.*;

public class Main {
    public static int[][] cartelas;
    public static int[] i_c;
    public static int[] cnt;
    public static int[] vencedores;
    public static int i_v;
    public static int N, K, U;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();
        U = scanner.nextInt();

        cnt = new int[N + 1];
        cartelas = new int[U + 1][N + 1];
        i_c = new int[U + 1];
        for (int i = 0; i <= U; i++)
            i_c[i] = 0;

        for (int c = 1; c <= N; c++) {
            for (int j = 0; j < K; j++) {
                int n = scanner.nextInt();
                cartelas[n][i_c[n]] = c;
                i_c[n]++;
            }
        }

        vencedores = new int[N];
        i_v = 0;

        for (int i = 1; i <= U && i_v == 0; i++) {
            int n = scanner.nextInt();

            for (int k = 0; k < i_c[n]; k++) {
                int c = cartelas[n][k];
                cnt[c]++;
                if (cnt[c] == K) {
                    vencedores[i_v] = c;
                    i_v++;
                }
            }
        }

        for (int k = 0; k < i_v; k++) {
            System.out.print(vencedores[k]);
            if (k < i_v - 1)
                System.out.print(" ");
        }
        System.out.println();

        scanner.close();
    }
}
