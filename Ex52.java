import java.util.Scanner;
public class Ex52 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 30;

        float[] altura = new float[TAM];
        int[] idade = new int[TAM];

        float media = 0;
        int cont = 0;

        for(int i = 0; i < TAM; i++){
            System.out.print("Digite sua altura e idade: ");
            altura[i] = entrada.nextFloat();
            idade[i] = entrada.nextInt();

            media+= altura[i];
        }

        media /= TAM;

        for(int i = 0; i< TAM; i++){
            if(altura[i] < media && idade[i] > 13){
                cont++;
            }
        }


        System.out.printf("Existem %d pessoas com mais de 13 anos menores que %.2f de altura ", cont, media);

        entrada.close();
    }
    
}
