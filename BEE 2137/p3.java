import java.util.Scanner;

public class p3 {

    public static void swap(String vetor[], int a, int b) {
        String temp = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int num = sc.nextInt();
            String vetor[] = new String[num];

            for (int i = 0; i < num; i++) {
                vetor[i] = sc.next();
            }

            for (int i = 0; i < (vetor.length - 1); i++) {
                int menor = i;
                for (int k = (i + 1); k < vetor.length; k++) {
                    if (vetor[menor].compareTo(vetor[k]) < 0) {
                        menor = k;
                    }

                }
                swap(vetor, menor, i);
            }

            for (int i = 0; i < num; i++) {
                System.out.println(vetor[i]);
            }

        }
        sc.close();
    }
}
