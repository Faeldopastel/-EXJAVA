import java.util.Scanner;
public class Ex40 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 10;

        int[] num = new int[TAM];

        for(int i = 0; i < TAM; i++){
            System.out.print("Digite um número: ");
            num[i] = entrada.nextInt();
        };

        for(int i = TAM - 1; i >= 0; i--){
            System.out.print("\n" + num[i]);
        }

        entrada.close();
    
    }
}
