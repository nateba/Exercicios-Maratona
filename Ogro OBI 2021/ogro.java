import java.util.*;

public class ogro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dedos = sc.nextInt();
        // primeira mao
        if (dedos >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print("I");
            }
        } // menos q 5 dedo
        else if (dedos < 5 && dedos > 0) {
            for (int k = 0; k < dedos; k++) {
                System.out.print("I");
            }
        } else { // nenhum dedo
            System.out.println("*");

        }
        dedos -= 5; // tira 5 dedo da mao esquerda
        System.out.println();

        // mao direita
        if (dedos > 0) { // printa numero d dedo se ainda tiver dedo
            for (int k = 0; k < dedos; k++) {
                System.out.print("I");
            }
        } // se nn tem dedo printa asterisco
        else {
            System.out.println("*");
        }

    }
}
