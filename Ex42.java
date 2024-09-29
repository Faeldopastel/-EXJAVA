import java.util.Scanner;
public class Ex42 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        final int TAM = 10;
        char[] letra = new char[TAM];
        char vogal[] = {'a', 'e', 'i', 'o', 'u'};
        char[] cosoante = new char[10];
        boolean e_v = false;
        int contC = 0;
        int k = 0;

        for(int i = 0; i < TAM; i++){
            System.out.print("Digite uma letra: ");
            letra[i] = entrada.nextLine().charAt(0);
            e_v = false;

            while(k < 5){
                if(letra[i] == vogal[k]){
                    e_v = true;
                    break;
                }else{
                    k++;
                }
            };

            if(e_v != true){
                contC++;
                cosoante[i] = letra[i];
            };




        }

        for(int i = 0; i < contC; i++){
            System.out.printf("Consoantes = %c\n", cosoante[i]);
        }
        System.out.printf("Total de consoantes = %d", contC);

        entrada.close();
    }
    
}
