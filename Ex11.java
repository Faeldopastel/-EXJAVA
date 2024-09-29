import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 10;

        int[] num = new int[10];
        int soma = 0, contP = 0, contI = 0;

        for(int i =0; i< TAM; i++){
            System.out.printf("Digite o %d° número", i + 1);
            num[i] = entrada.nextInt();
            soma += num[i];
        }

        for(int i = 0; i<TAM; i++){
            if((num[i]%2) == 0){
                contP++;
            } else {
                contI++;
            }
        }

        System.out.printf("A soma dos números é: %d\n", soma);
        System.out.println("Existem " + contP +" Pares. E existem " + contI + " Impares");

        entrada.close();
    }
    
}
