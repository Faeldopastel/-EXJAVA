import java.util.Scanner;
public class Ex31 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int TAM = 10;

        float alt, mais_a= 0, mais_b = 0;
        int cod, c_alto = 0, c_baixo=0;

        for(int i = 0; i < TAM; i++){
            System.out.printf("Digite o código do %d° aluno: ", i+1);
            cod = entrada.nextInt();
            System.out.print("Qual é a altura dele? (Em cm): ");
            alt = entrada.nextFloat();

            if(Math.round(alt) != alt){
                alt *= 100;
                System.out.println(alt);
            }

            if(i == 0){
                mais_a = mais_b = alt;
                c_alto = c_baixo = cod;
            } else {

                if(alt > mais_a){
                    mais_a = alt;
                    c_alto = cod;
                } else if(alt < mais_b){
                    mais_b = alt;
                    c_baixo = cod;
                }
            }
        }
        System.out.printf("O aluno mais alto tem o código %d e %.0fcm de altura", c_alto,mais_a);
        System.out.printf("O aluno mais baixo tem o código %d e %.0fcm de altura", c_baixo,mais_b);
        entrada.close();
        
    }
    
}
