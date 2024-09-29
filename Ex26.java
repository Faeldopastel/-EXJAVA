import java.util.Scanner;
public class Ex26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        float preco;

        System.out.print("Digite a quantidade de produtos do cliente;");
        int qtd = entrada.nextInt();
        while(qtd < 0){
            System.out.println("Número de produtos negativo. Digite novamente:");
            qtd = entrada.nextInt();
        }

        System.out.print("\nDigite o valor do paozin");
        preco = entrada.nextFloat();

        for(int i = 1; i <=qtd; i++){
            System.out.printf("%d - R$ %.2f\n", i, (float)i*preco);

        }

        entrada.close();
        
    }
    
}
