import java.util.*;;

public class amigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeAmigosL = input.nextLine();
        String nomeAmigosN = input.nextLine();
        String nomeAmigo = input.nextLine();

        String[] amigosL = nomeAmigosL.split(" ");
        String[] amigosN = nomeAmigosN.split(" ");

        if (nomeAmigo.equals("Nao")) {
            for (String nome : amigosL) {
                System.out.print(nome + " ");
            }
            for (String nome : amigosN) {
                System.out.print(nome + " ");
            }
        } else {
            for (String nome : amigosL) {
                if (nome.equals(nomeAmigo)) {
                    for (String name : amigosN)
                        System.out.print(name + " ");
                }

                System.out.print(nome + " ");
            }
        }

        System.out.println("");

        input.close();
    }
}
