import java.util.*;

public class bee1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = new String();

        while (sc.hasNext()) {
            texto += sc.nextLine();
            texto += " ";
        }

        String[] palavras = texto.split("\\W");

        List<String> listaPalavras = new ArrayList<String>();

        for (String s : palavras) {
            if (!(s.isEmpty())) {
                listaPalavras.add(s.toLowerCase());
            }
        }

        // Limpar as repetições
        for (int i = 0; i < listaPalavras.size(); i++) {
            for (int j = i + 1; j < listaPalavras.size(); j++) {
                if (listaPalavras.get(i).equals(listaPalavras.get(j))) {
                    listaPalavras.remove(j);
                }
            }
        }

        Collections.sort(listaPalavras);

        for (String s : listaPalavras) {
            System.out.println(s);
        }

        sc.close();
    }
}