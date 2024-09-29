import java.util.Scanner;
public class Ex43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 20;

        int[] num = new int[20];
        int[] par = new int[20];
        int cont_par = 0, cont_impar = 0;
        int[] impar = new int[20];

        for(int i = 0; i < TAM; i++){
            System.out.print("Digite um número: ");
            num[i] = entrada.nextInt();

            if((num[i] % 2) == 0){
                cont_par++;
                par[cont_par - 1] = num[i];
            } else {
                cont_impar++;
                impar[cont_impar - 1] = num[i];
            };

        }

        System.out.println("número pares");
        for(int i = 0; i < cont_par; i++){
            System.out.println(par[i]);
        };

        System.out.println("Numeros impares ");
        for(int i = 0; i < cont_impar; i++){
            System.out.println(impar[i]);
        };
        entrada.close();
    }
    
}
