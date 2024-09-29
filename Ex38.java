import java.util.Scanner;
public class Ex38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int i = 0;

        System.out.print("Digite um número inteiro positivo");
        num = entrada.nextInt();

        while(num > 0){

            i *= 10;
            i += num % 10;
            num /= 10;

        }

        System.out.print("Numero invertido é " + i);
        entrada.close();
        

    }
    
}
