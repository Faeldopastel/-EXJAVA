import java.util.Scanner;
public class Ex13{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.print("Digite um número para obter seu fatorial: ");
        num = entrada.nextInt();

        for(int i = num - 1; i >= 1; i--){
            
            num *= i;
            
        }
        System.out.println(num);
        entrada.close();

        
    }
}