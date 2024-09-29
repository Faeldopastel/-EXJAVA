import java.util.Scanner;
public class Ex41 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 4;

        float[] nota = new float[TAM];
        float media = 0;

        for(int i = 0; i <TAM; i++){
            System.out.print("Digite a nota: ");
            nota[i] = entrada.nextInt();
            media += nota[i];
        }

        media/= TAM;

        for(int i = 0; i <TAM; i++){
            System.out.println(nota[i]);
        }
        System.out.printf("Media = %.2f", media);

        entrada.close();
    }
    
}
