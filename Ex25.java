import java.util.Scanner;
public class Ex25 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        final float PRECO = 1.99f;

        System.out.print("Digite a quantidade de produtos do cliente;");
        int qtd = entrada.nextInt();
        while(qtd < 0){
            System.out.println("Número de produtos negativo. Digite novamente");
            qtd = entrada.nextInt();
        }

        for(int i = 1; i <=qtd; i++){
            System.out.printf("%d - R$ %.2f\n", i, (float)i*PRECO);

        }

        entrada.close();
    }
    
}
