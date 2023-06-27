import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int megabytes = sc.nextInt();

        int meses = sc.nextInt();

        int resto = 0;

        for (int i = 0; i < meses; i++) {
            int novoMes = sc.nextInt();
            resto += megabytes - novoMes;

        }
        MyIO.println(resto + megabytes);
    }
}