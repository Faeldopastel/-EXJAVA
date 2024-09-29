import java.util.Scanner;
public class Ex54 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;
        float media = 0;
        int maior = 0, menor = 0, cont_p = 0, cont_i = 0;
        int soma = 0, soma_pri = 0, soma_sec = 0;  

        System.out.print("Digite um número impar entre 3 e 11");
        num = entrada.nextInt();
        while((num % 2) == 0 || num < 3 || num > 11){

            System.out.print("\nDigite novamente: ");
            num = entrada.nextInt();
        }

        final int NUM = num;

        int[][] matriz = new int[NUM][NUM];

        for(int i = 0; i < NUM; i++){
            for(int k = 0; k < NUM; k++){
                System.out.print("Digite um número: ");
                matriz[i][k] = entrada.nextInt();

                media += matriz[i][k];
                soma += matriz[i][k];

                if(i == 0 && k == 0){
                    maior = matriz[i][k];
                    menor = matriz[i][k];
                }else{

                    if(matriz[i][k] > maior){
                        maior = matriz[i][k];
                    }else if(matriz[i][k] < menor){
                        menor = matriz[i][k];
                    }
                    
                }

                if((matriz[i][k] % 2) == 0){
                    cont_p++;
                } else{
                    cont_i++;
                }

                if(i == k){
                    soma_pri += matriz[i][k];
                }

                if((i + k) == (NUM - 1)){
                    soma_sec += matriz[i][k];
                }
            }
        }

        media/= (NUM*NUM);

        System.out.printf("Maior = %d", maior);
        System.out.printf("\nMenor = %d", menor);
        System.out.printf("\nMedia = %.2f", media); 
        System.out.printf("\nSoma Dig principal = %d", soma_pri);
        System.out.printf("\nSoma Dig secundaria = %d", soma_sec);
        System.out.printf("\nSoma = %d", soma);
        System.out.printf("\nQTD Pares = %d", cont_p);
        System.out.printf("\nQTD Impar = %d\n", cont_i);

        System.out.println("Matriz formatada");

        for(int i = 0; i < NUM; i++){
            for(int k = 0; k < NUM; k++){
                System.out.print(matriz[i][k]);
            }
            System.out.println();
        }


        entrada.close();
        
    }
    
}
