import java.util.*;

public class bee2136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inimigosHaba = new ArrayList<String>();
        List<String> amigosHaba = new ArrayList<String>();

        String nome = sc.next();

        while (!(nome.equals("FIM"))) {
            String yesNo = sc.next();

            if (yesNo.equals("YES")) {
                if (!(amigosHaba.contains(nome))) {
                    amigosHaba.add(nome);
                }
            } else if (yesNo.equals("NO")) {
                if (!(inimigosHaba.contains(nome))) {
                    inimigosHaba.add(nome);
                }
            }

            nome = sc.next();
        }

        int maiorNome = amigosHaba.get(0).length();

        for (int i = 1; i < amigosHaba.size(); i++) {
            if (amigosHaba.get(i).length() > maiorNome) {
                maiorNome = amigosHaba.get(i).length();
            }
        }

        String winner = new String();

        for (int i = 0; i < amigosHaba.size(); i++) {
            if (amigosHaba.get(i).length() == maiorNome) {
                winner = amigosHaba.get(i);
                i = amigosHaba.size();
            }
        }

        Collections.sort(amigosHaba);
        Collections.sort(inimigosHaba);

        for (String k : amigosHaba) {
            System.out.println(k);
        }

        for (String k : inimigosHaba) {
            System.out.println(k);
        }

        System.out.println("");
        System.out.println("Amigo do Habay:");
        System.out.println(winner);

        sc.close();
    }
}