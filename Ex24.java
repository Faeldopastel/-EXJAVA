import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cd;
        float valor, total = 0;

        System.out.print("Digite a quantidade de CD's que você possui");
        cd = entrada.nextInt();

        for(int i = 1; i <= cd; i++){
            System.out.printf("\nDigite o valor do cd (%d)", i);
            valor = entrada.nextFloat();
            total += valor;

        }
        valor = total;
        total /= cd;

        System.out.printf("Seu investimento em %d CD's foi de %.2f reais e uma média de %.2f pra cada cd", cd, valor, total);


        entrada.close();


    }
    
}
