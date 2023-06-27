import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEstados = sc.nextInt();
        for (int i = 0; i < numEstados; i++) {
            String estado = sc.next();
            String alcoolS = sc.next();
            String gasosaS = sc.next();
            double gasosa = Double.parseDouble(gasosaS);
            double alcool = Double.parseDouble(alcoolS);
            if (alcool <= (0.7 * gasosa)) {
                System.out.println(estado);
            }
        }

    }

}
