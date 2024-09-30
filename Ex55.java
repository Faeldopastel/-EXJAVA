import java.util.Scanner;
public class Ex55 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 5;

        float caro = 0, barato = 0;
        float[] med_p = new float[TAM];
        float[] soma_m = new float[TAM];
        float[][] mercados = new float[TAM][TAM];

        for(int i = 0; i < TAM; i++){
            for(int k = 0; k <TAM; k++){
                System.out.printf("Digite o valor do produto (%d) do mercado (%d)", k+1, i+1);
                mercados[i][k] = entrada.nextFloat();
                soma_m[i] += mercados[i][k];
            }

            if(i == 0){
                caro = soma_m[i];
                barato = soma_m[i];
            } else{
                if(soma_m[i] > caro){
                    caro = soma_m[i];
                } else if(soma_m[i] < barato){
                    barato = soma_m[i];
                }
            }
        }

        for(int i = 0; i < TAM; i++){
            for(int k = 0; k < TAM; k++){
                med_p[i] += mercados[k][i];
            }
            med_p[i] /= TAM;
            System.out.printf("Media por produto(%d) = %.2f\n",i, med_p[i]);
            System.out.printf("A soma m(%d) = %.2f\n",i + 1, soma_m[i]);
        }

        System.out.printf("Mais caro = %.2f\n", caro);
        System.out.printf("Mais barato = %.2f\n", barato);

        for(int i = 0; i < TAM; i++){
            System.out.printf("Mercado(%d)", i + 1);
            for(int k = 0; k < TAM; k++){
                System.out.print(" " + mercados[i][k]);
            }
        }

        entrada.close();
    } 
    
}
