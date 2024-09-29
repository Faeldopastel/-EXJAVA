import java.util.Scanner;
public class Ex51 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 10;

        int[] v1 = new int[TAM];
        int[] v2 = new int[TAM];

        int c1 = 0, c2 = 0;
        int contG = 0;

        for(int i = 0;i < TAM; i++){
            System.out.print("Digite um número inteiro para o vetor 1: ");
            v1[i] = entrada.nextInt();
            System.out.print("\nDigite um número inteiro para o vetor 2: ");
            v2[i] = entrada.nextInt();
        }

        int[] v3 = new int[TAM + TAM];

        while(c1 < 10 || c2 < 10){

            if((contG % 2) == 0){
                v3[contG] = v1[c1];
                c1++;
                contG++;
            }else{
                v3[contG] = v2[c2];
                c2++;
                contG++;
            }

        }


        for(int i = 0; i <(TAM + TAM); i++){
            System.out.println(v3[i]);
        }
        entrada.close();

        
    }
    
}
