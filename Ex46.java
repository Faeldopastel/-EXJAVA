import java.util.Random;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        char alfabeto[] = {'a', 'b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' ,'n','o', 'p', 'q' ,'r' , 's', 't' , 'u', 'v', 'w', 'x', 'y', 'z'};
        
        char vogal[] = {'a', 'e', 'i', 'o', 'u'};
        int num, alea = 0, vog = 0, cont = 0;

        System.out.print("Digite um número para ter sua senha: ");
        num = entrada.nextInt();
        while(num < 0 || num > 26){
            System.out.print("\nDigite novamente: ");
            num = entrada.nextInt();
        }

       while(cont < num){
        alea = rand.nextInt(25);
        vog = rand.nextInt(5);


        if((cont % 2) == 0){

            for(int i = 0; i < 5; i++){
                if(alfabeto[alea] == vogal[i]){
                    alea = rand.nextInt(25);
                };
                
            }
            System.out.print(alfabeto[alea]);

        }

        if((cont % 2) != 0){
            vog = rand.nextInt(5);
            System.out.print(vogal[vog]);
        }

        cont++;
       }
    
        entrada.close();
    }
    
}
