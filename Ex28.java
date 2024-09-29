import java.util.Scanner;
public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float temp, media = 0, maior = 0, menor = 0, pare = 1;
        int cont = 0;

        while(pare == 1){
            System.out.print("Digite uma temperatura: ");
            temp = entrada.nextFloat();
            cont++;

            if(cont == 1){
                menor = maior = temp;
                media += temp;
            } else {
                media += temp;

                if(temp < menor){
                    menor = temp;
                } else if(temp> maior){
                    maior = temp;
                }

                if(cont > 7){
                    System.out.print("Deseja parar? 1 = Sim; 0 = Não: ");
                    pare = entrada.nextFloat();
                }

            }


        }
        System.out.printf("A maior temperatura: %.2f\n", maior);
        System.out.printf("A menor temperatura: %.2f\n", menor);
        System.out.printf("A média das temperaturas: %.2f", media / cont);

        entrada.close();
    }
    
}
