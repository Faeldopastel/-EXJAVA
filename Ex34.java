import java.util.Scanner;
public class Ex34 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int[] cont = new int[4];

        while(num >= 0){
            System.out.print("Digite um número (Digite um número negativo para parar)");
            num = entrada.nextInt();

            if(num < 0){
                break;
            }

            if(num >= 0 && num <=25){
                cont[0]++;
            } else if(num > 25 && num <= 50){
                cont[1]++;
            } else if(num > 50 && num <= 75){
                cont[2]++;
            } else{
                cont[3]++;
            }

        }
        
        System.out.printf("0 - 25 = %d\n", cont[0]);
        System.out.printf("26 - 50 = %d\n", cont[1]);
        System.out.printf("51 - 75 = %d\n", cont[2]);
        System.out.printf("76 - 100 = %d\n", cont[3]);

        entrada.close();
    }
    
}
