import java.util.*;

public class contas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorTotal = sc.nextInt();
        int vetorContas[]= new int[3];
        for(int i=0;i<3;i++){
            vetorContas[i]=sc.nextInt();
        }
        int soma=0;
        int contador=0;
        for(int i=0;i<3;i++){
            soma+=vetorContas[i];
        }
        Arrays.sort(vetorContas);
        //Pagar 3
        if(valorTotal-soma>=0){
            contador=3;
        } // da p pagar nenhuma
         else if(valorTotal<vetorContas[2]&&valorTotal<vetorContas[1]&&valorTotal<vetorContas[0]){
            contador=0;
        } else if(valorTotal-vetorContas[0]-vetorContas[1]>=0){
            contador=2;
        } else {
            
            if(valorTotal-vetorContas[2]>=0){
                valorTotal-=vetorContas[2];
                contador=1;
            }

            for(int i=0;i<2;i++){
                if(valorTotal-vetorContas[i]>0){
                    contador++;
                    valorTotal-=vetorContas[i];
                } 
            }
        }
            
        System.out.println(contador);
           
           

        
    }
}
