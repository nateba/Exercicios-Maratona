import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        int tam = sc.nextInt();

        int estoque[][]= new int[tipo][tam];

        for(int i = 0; i<tipo;i++){
            for (int j=0;j<tam;j++){
                estoque[i][j]=sc.nextInt();
            }
        }

        int casos= sc.nextInt();
        int vendas=0;

        for(int i=0;i<casos;i++){
            int lin=sc.nextInt();
            int col=sc.nextInt();
            if(estoque[lin-1][col-1]-1>=0){
                vendas++;
                estoque[lin-1][col-1]-=1;
            }
        }
        System.out.println(vendas);
    }
}
