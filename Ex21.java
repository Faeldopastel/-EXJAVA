import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, stop = 0, cont = 0, media = 0;
        boolean pare =  true;

        while(pare == true){
            System.out.print("Digite um número: ");
            cont++;
            idade = entrada.nextInt();
            media += idade;

            if(cont > 1){
                System.out.print("\nDeseja continuar? 1 para sim; 2 para nao: ");
                stop = entrada.nextInt();
                

                if(stop == 2){
                    pare = false;
                }

            }


        }

        media /= cont;

        if(media <= 25){
            System.out.print("Turma jovem");
        } else if( media >= 26 && media <= 60){
            System.out.print("Turma adulta");
        } else{
            System.out.print("Turma idosa");
        }

        entrada.close();


    }
    
}
