import java.util.Scanner;
public class Ex29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int ini, fim, num, tr;


        System.out.print("Digite o número da tabuada desejada: ");
        num = entrada.nextInt();

        System.out.print("Agora o começo e o fim dela: ");
        ini = entrada.nextInt();
        fim = entrada.nextInt();

        if(ini > fim){
            tr = ini;
            ini = fim;
            fim = tr;
        }

        for(int i = ini; i <= fim; i++){
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }

        entrada.close();
    }
    
}
