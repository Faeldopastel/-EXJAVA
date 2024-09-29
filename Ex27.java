import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float valor, din, total = 0;
        int cont = 0;

        System.out.print("Começar operação?\n1-Sim\n0-não\n");
        valor = entrada.nextFloat();

        

        while (valor != 0) {
            
            
            System.out.println("Lojas Tajabara");
            while(valor != 0){
                cont++;
                
                System.out.printf("Produto %d: R$: ",cont);
                valor = entrada.nextFloat();
                total += valor;
                
            }
            
            System.out.printf("Total: R$ %.2f\n", total);
            System.out.print("Dinheiro R$: ");
            din = entrada.nextFloat();
            System.out.printf("\nTroco: %.2f", din - total);
            
            
            System.out.print("Uma nova compra? 1 - Sim\n 0 - Não");
            valor = entrada.nextFloat();
        }



        entrada.close();

        

        
    }
    
}
