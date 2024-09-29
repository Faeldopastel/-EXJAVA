import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, aux;

        System.out.print("Digite dois números: ");
        a = entrada.nextInt();
        b = entrada.nextInt();

        if(b < a){
            aux = a;
            a = b;
            b = aux;
        };

        for(int i = a; i <= b; i++){
            System.out.print("|" + i);
        }

        entrada.close();

    }
    
}
