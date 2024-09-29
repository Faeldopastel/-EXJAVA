import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        float nota;

        do{
            System.out.print("Digite uma nota de 0 à 10");
            nota = entrada.nextFloat();

            if(nota < 0 || nota > 10){
                System.out.print("Fora dos limites\n");
            }

        } while(nota < 0 || nota > 10);

        System.out.printf("Sua nota %.2f", nota);

        entrada.close();
    }
    
}
