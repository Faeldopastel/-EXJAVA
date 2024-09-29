import java.util.Scanner;
public class Ex39 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            num[i] = entrada.nextInt();
        };

        for(int i = 0; i < 5; i++){
            System.out.print("\n" + num[i]);
        }

        
        entrada.close();
    }
    
}
