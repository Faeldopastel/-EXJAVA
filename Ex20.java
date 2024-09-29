import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, stop = 0, cont = 0, media = 0;
        boolean pare =  true;

        while(pare == true){
            System.out.print("Digite um número: ");
            cont++;
            num = entrada.nextInt();
            media += num;

            if(cont > 1){
                System.out.print("\nDeseja continuar? 1 para sim; 2 para nao: ");
                stop = entrada.nextInt();
                

                if(stop == 2){
                    pare = false;
                }

            }


        }

        media /= cont;

        System.out.printf("A média é %d", media);

        entrada.close();

        
    }
    
}
