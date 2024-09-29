import java.util.Scanner;
public class Ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int b, e;

        System.out.println("Digite um número(Base do expoente): ");
        b = entrada.nextInt();
        System.out.print("\nDigite outro número (Expoente): ");
        e = entrada.nextInt();

        for(int i = 1; i < e; i++){
            b *= b;
        }

        System.out.println("Resultado = " + b);
        entrada.close();
    }
    
}
