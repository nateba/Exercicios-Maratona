import java.util.Scanner;

public class Van {
    public static void swap(String x[], int menor, int i) {
        String tmp = x[menor];
        x[menor] = x[i];
        x[i] = tmp;
    }

    public static void swap2(int x[], int menor, int i) {
        int tmp = x[menor];
        x[menor] = x[i];
        x[i] = tmp;
    }

    public static void swap3(String x[], int menor, int i) {
        String tmp = x[menor];
        x[menor] = x[i];
        x[i] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCriancas = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        String nome[] = new String[numCriancas];
        String charzin[] = new String[numCriancas];
        int preco[] = new int[numCriancas];

        for (int i = 0; i < numCriancas; i++) {
            String linha = sc.nextLine();
            String nomeCharPreco[] = linha.split(" ");

            nome[i] = nomeCharPreco[0];
            charzin[i] = nomeCharPreco[1];
            preco[i] = Integer.parseInt(nomeCharPreco[2]);
        }
        for (int i = 0; i < preco.length - 1; i++) {
            int menor = i;

            for (int j = (i + 1); j < preco.length; j++) {
                if (preco[menor] < preco[j]) {
                    menor = j;
                }
            }
            swap2(preco, menor, i);
            swap(nome, menor, i);
            swap3(charzin, menor, i);

        }
        for (int i = 0; i < charzin.length - 1; i++) {
            int menor = i;

            for (int j = (i + 1); j < charzin.length; j++) {
                if (preco[menor] == preco[j]) {

                    if ((charzin[menor].compareTo(charzin[j])) < 0) {

                        menor = j;
                    }
                }
                swap2(preco, menor, i);
                swap(nome, menor, i);
                swap3(charzin, menor, i);
            }
        }

        for (int i = 0; i < nome.length - 1; i++) {
            int menor = i;

            for (int j = (i + 1); j < nome.length; j++) {
                if (charzin[menor].compareTo(charzin[j]) == 0) {

                    if ((nome[menor].compareTo(nome[j])) < 0) {

                        menor = j;
                    }
                }
                swap2(preco, menor, i);
                swap(nome, menor, i);
                swap3(charzin, menor, i);
            }
        }

        for (int b = nome.length - 1; b > -1; b--) {
            System.out.println(nome[b]);
        }
    }
}
