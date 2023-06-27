/**
 * crianca
 */
import java.util.*;
public class crianca {
    public static void swap(String criancas[],int menor,int i){
        String tmp = criancas[menor];
            criancas[menor] = criancas[i];
            criancas[i]=tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCriancas= sc.nextInt();

        String comportamento[]= new String[numCriancas];
        String criancas[]= new String[numCriancas];

        //prenche vetores

        for(int i=0;i<numCriancas;i++){
            comportamento[i]=sc.next();
            
            criancas[i]=sc.next();
            
        }

        int contador1 =0; //comportadas
        int contador2 =0; //nao comportadas

        for(int k=0;k<numCriancas;k++){
            if(comportamento[k].compareTo("+")==0){
                contador1++;
            } 
            if(comportamento[k].compareTo("-")==0){
                contador2++;
            }
        }

        //ordena criancada

        for(int i=0;i<criancas.length-1;i++){
            int menor=i;
            
            for(int j=(i+1);j<criancas.length;j++){
                if(((criancas[menor].compareTo(criancas[j]))<0)){
                    menor=j;
                }
            }
            swap(criancas,menor,i);
            
        }

        // printa criancada na ordem
        for(int b=criancas.length-1;b>-1;b--){
            System.out.println(criancas[b]);
        }

        System.out.println("Se comportaram: "+ contador1 + " | Nao se comportaram: "+ contador2);
 
    }
}