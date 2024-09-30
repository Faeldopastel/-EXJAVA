import java.util.Scanner;
public class Ex57 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num; 

        System.out.print("Digite o número de atletas: ");
        num = entrada.nextInt();

        final int TAM = num;
        final int SAL = 5;
        int ma = 0;
        float menor_s = 0, maior_s = 0, ven = 0, ult = 0;
        float[] media_s = new float[SAL];
        Float[][] camp = new Float[TAM][SAL];

        for(int i = 0; i< TAM; i++){
            for(int k = 0; k < SAL; k++){
                System.out.print("pulo num " + (k+1) + " ");
                camp[i][k] = entrada.nextFloat();
                media_s[i] = camp[i][k];

                if(i == 0 && k == 0){
                    menor_s = camp[i][k];
                    maior_s = camp[i][k];
                } else{

                    if(camp[i][k] > maior_s){
                        maior_s = camp[i][k];
                        ma = i;
                        
                    } else if(camp[i][k] < menor_s && ma != i){
                        menor_s = camp[i][k];
                        System.out.print("passei");
                    }
                }
            }
            media_s[i] /= SAL;
            
        }
        for(int i = 0; i< TAM; i++){
            for(int k = 0; k < SAL; k++){
                if(maior_s == camp[i][k]){
                    ven = media_s[i];
                }else if(menor_s == camp[i][k]){
                    ult = media_s[i];
                }
            }
            
            
        }

        System.out.printf("media do vencendor %.2f\n", ven);
        System.out.printf("media do ult colocado %.2f\n", ult);
        System.out.printf("maior %.2f\n", maior_s);
        System.out.printf("menor %.2f\n", menor_s);

        for(int i = 0; i<TAM; i++){
            for(int k = 0; k<SAL; k++){
                System.out.printf("Salto %d participante\n", i + 1);
                System.out.println(camp[i][k]);
            }
            System.out.printf("Sua média: %.2f\n", media_s[i]);
            System.out.println();
        }

        entrada.close();


        
    }
    
}
