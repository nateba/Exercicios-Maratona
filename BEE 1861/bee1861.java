import java.util.*;

public class bee1861 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> assassinos = new ArrayList<String>();
        List<String> quemMorreu = new ArrayList<String>();

        List<String> aindaVivos = new ArrayList<String>();

        String assassino = sc.next();

        while (!(assassino.equals("FIM"))) {
            String assassinado = sc.next();

            assassinos.add(assassino);
            quemMorreu.add(assassinado);

            assassino = sc.next();
        }

        // Armazenar somente os assassinos não-assasinados
        for (int i = 0; i < assassinos.size(); i++) {
            boolean morto = false;

            for (int j = 0; j < quemMorreu.size(); j++) {
                if (assassinos.get(i).equals(quemMorreu.get(j))) {
                    morto = true;
                    j = quemMorreu.size();
                }
            }

            if (!morto) {
                aindaVivos.add(assassinos.get(i));
            }
        }

        // Remover os assassinos repetidos
        for (int i = 0; i < aindaVivos.size(); i++) {
            for (int j = i + 1; j < aindaVivos.size(); i++) {
                if (aindaVivos.get(i).equals(aindaVivos.get(j))) {
                    aindaVivos.remove(j);
                    j = aindaVivos.size();
                }
            }
        }

        // Ordenar o array
        Collections.sort(aindaVivos);

        System.out.println("HALL OF MURDERERS");

        // Iterar pelos assassinos e sua contagem de assassinatos
        for (int i = 0; i < aindaVivos.size(); i++) {
            int contador = 0;

            for (int j = 0; j < assassinos.size(); j++) {
                if (aindaVivos.get(i).equals(assassinos.get(j))) {
                    contador++;
                }
            }

            System.out.println(aindaVivos.get(i) + " " + contador);
        }

        sc.close();
    }
}