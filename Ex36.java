import java.util.Scanner;
public class Ex36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] cand = new int[4];
        int votos_n = 0, votos_b = 0, voto = 1, total = 0;
        boolean votacao = true;


        while(votacao == true){

            System.out.print("Digite o número do canditado para votar (Para encerrar a votação, digite 0):\n");
            System.out.println("1 - Tião do gás");
            System.out.println("2 - Urubu do pix");
            System.out.println("3 - Seu Sirigueijo ");
            System.out.println("4 - Megatron");
            System.out.println("5 - Nulo");
            System.out.println("6 - Voto em branco");
            voto = entrada.nextInt();

            if(voto == 0){
                votacao = false;
            };

            while(voto < 0 || voto > 6){
                System.out.print("\nDigite novamente: ");
                voto = entrada.nextInt();
            };
    


            if(voto == 1){
                cand[0]++;
                total++;
            } else if(voto == 2){
                cand[1]++;
                total++;
            } else if(voto == 3){
                cand[2]++;
                total++;
            } else if(voto == 4){
                cand[3]++;
                total++;
            } else if(voto == 5){
                votos_n++;
                total++;
            } else{
                votos_b++;
                total++;
            }
        }

        System.out.printf("Porcentagem de votos nulos %d porcento. QTD = %d\n", (votos_n * 100) / total, votos_n);
        System.out.printf("Porcentagem de votos em branco %d porcento. QTD = %d\n", (votos_b * 100) / total, votos_b);

        System.out.println("votos para Tião do gás = " + cand[0]);
        System.out.println("votos para Urubu do pix = " + cand[1]);
        System.out.println("votos para Seu Sirigueijo = " +cand[2]);
        System.out.println("votos para Megatron = " + cand[3]);

        entrada.close();

    }
    
}
