import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, numv, v;

        System.out.print("Digite o número de votantes: ");
        numv = entrada.nextInt();

        for(int i = 1; i <= numv; i++){
            System.out.println("Escolha em quem votar: ");
            System.out.print("Candidato 1 = 1\nCandidato 2 = 2\nCanditato 3 = 3");
            v = entrada.nextInt();

            while(v < 1 || v > 3){
                System.out.println("\nVote novamente: ");
                v = entrada.nextInt();
            }

            if(v == 1){
                c1++;
            } else if(v == 2){
                c2++;
            }else{
                c3++;
            }


        }


        System.out.printf("Canditato 1 = %d votos\nCanditato 2 = %d votos\nCanditato 3 = %d votos\n", c1, c2, c3);
        entrada.close();
        
    }

}