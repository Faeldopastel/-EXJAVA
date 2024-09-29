import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        final int TAM = 10;
        final int MED = 4;

        int cont = 0;
        float media = 0;
        int nota, maior_S = 0;
        float[] alunos = new float[TAM];

        while(cont < 9){
            media = 0;
            for(int i = 0; i < MED; i++){
                System.out.printf("Digite sua (%d) nota: ", i + 1);
                nota = entrada.nextInt();
                media += nota;
            };

            media /= MED;

            alunos[cont] = media;

            if(media > 7f){
                maior_S++;
            }

            cont++;

        }

        System.out.printf("QTD de alunos com nota maio que sete: %d", maior_S);

        entrada.close();


        
    }
    
}
