
/**
 * p4
 */
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {

            int vetor[] = new int[num];

            for (int i = 0; i < num; i++) {
                vetor[i] = sc.nextInt();
            }

            for (int i = 0; i < (vetor.length - 1); i++) {
                int menor = i;
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[menor] > vetor[j]) {
                        menor = j;
                    }
                }
                int tmp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = tmp;
            }

            for (int i = 0; i < vetor.length; i += 2) {
                if (i == (num - 1)) {
                    System.out.println(vetor[i]);
                } else {
                    if (vetor[i] != vetor[i + 1]) {
                        System.out.println(vetor[i]);
                    }
                }

            }
            num = sc.nextInt();
        }
        sc.close();
    }

}