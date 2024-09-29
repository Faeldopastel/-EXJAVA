import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, cont = 0;

        while(cont < 20){
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            if((num % 2) != 0  && (num % 1) == 0 && (num % num) == 0){
                System.out.println("Primo");
            } else {
                System.out.println("Não primo");
            }
        }
        entrada.close();

        
    }
    
}
