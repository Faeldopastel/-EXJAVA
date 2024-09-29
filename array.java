import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        final int TAM = 5;


        int soma = 0, menor= 0, maior= 0;
        double media = 0;


        int[][] num = new int[TAM][TAM];

        for(int i = 0; i < TAM; i++){
            for(int k = 0; k<5; k++){

                System.out.print("Digite um número: ");
                num[i][k] = entrada.nextInt();
                soma += num[i][k];
    
                if( i == 0){
                    maior = menor = num[i][k];
                }else{
                    if(num[i][k]> maior){
                        maior = num[i][k];
                    } else if(num[i][k]< menor){
                        menor = num[i][k];
                    };
                }
            }



        }

        media =  soma /(float)(TAM * TAM);

        System.out.printf("O maior %d\nO menor %d\n", maior, menor);
        System.out.printf("A media %.2f\n", media);
        System.out.printf("%d é a soma", soma);

        

        entrada.close();
    }
    
}
