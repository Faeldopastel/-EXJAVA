import java.util.Scanner;
public class Ex45 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final int TAM = 5;
        

        int[] num = new int[5];
        int soma = 0, multi = 1;

        for(int i = 0; i < TAM; i++){
            System.out.print("Digite um número: ");
            num[i] = entrada.nextInt();
            soma += num[i];
            multi *= num[i];
        }

        for(int i = 0; i < TAM; i++){
            System.out.print(num[i]);
        };

        System.out.printf("A soma do números é: %d\n", soma);
        System.out.printf("A multiplição dos números %d", multi);

        entrada.close();
        
    }
    
}
