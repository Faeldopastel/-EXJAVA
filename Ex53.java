import java.util.Scanner;
public class Ex53 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, aux;

        System.out.print("Digite o tamanho do seu vetor entre 0 e 20: ");
        num = entrada.nextInt();

        while(num < 0 || num > 20){
            System.out.print("\nDigite novamente: ");
            num = entrada.nextInt();
        };

        final int NUM = num;
        int[] v = new int[NUM];

        for(int i = 0; i < NUM; i++){
            System.out.printf("Digite o valor (%d): ", i+1);
            v[i] = entrada.nextInt();
        };

        for(int i = 0; i < NUM; i++){
            aux = 0;
            System.out.printf("%d:", v[i]);
            while(aux < v[i]){
                System.out.print("#");
                aux++;
            }
            System.out.println();

        }
        
        entrada.close();
    }
    
}
