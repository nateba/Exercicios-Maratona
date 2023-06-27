import java.io.*;
import java.util.*;

class No {
    public int elemento;
    public No esq, dir;

    public No(int elemento) {
        this(elemento, null, null);
    }

    public No(int elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(int item) throws Exception {
        raiz = inserir(item, raiz);
    }

    private No inserir(int item, No i) throws Exception {
        if (i == null) {
            i = new No(item);
        } else if (item < i.elemento) {
            i.esq = inserir(item, i.esq);
        } else if (item > i.elemento) {
            i.dir = inserir(item, i.dir);
        } else {
            throw new Exception("não pode repetido");
        }

        return i;
    }

    public int getAltura() {
        return getAltura(raiz, 0);
    }

    private int getAltura(No i, int altura) {
        if (i == null) {
            altura--;
        } else {
            int alturaEsq = getAltura(i.esq, altura + 1);
            int alturaDir = getAltura(i.dir, altura + 1);
            altura = (alturaEsq > alturaDir) ? alturaEsq : alturaDir;
        }

        return altura;
    }

    public void printPorNivel() {
        int alt = getAltura();
        for (int i = 1; i <= alt + 1; i++) {
            printNivel(raiz, i);
        }
    }

    private void printNivel(No i, int nivel) {
        if (i != null) {
            if (nivel == 1) {
                System.out.print(i.elemento + " ");
            } else {
                printNivel(i.esq, nivel - 1);
                printNivel(i.dir, nivel - 1);
            }
        }
    }
}

public class bee1466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Arvore arvore = new Arvore();
            int k = sc.nextInt();

            for (int j = 0; j < k; j++) {
                int temp = sc.nextInt();
                try {
                    arvore.inserir(temp);
                } catch (Exception e) {
                }
            }

            System.out.println("Case " + (i + 1) + ":");
            arvore.printPorNivel();
            System.out.println();
            if (i + 1 < n) {
                System.out.println();
            }
        }

    }

}