import java.util.Scanner;
public class Ex4{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float cres_a, cres_b;
        int hab1, hab2, anos = 0;

        System.out.print("Digite a porcentagem anual de crescimento anual da cidade A: ");
        cres_a = entrada.nextFloat();

        while(cres_a <= 0){
            System.out.println("\nCrescimento não existe. Digite novamente: ");
            cres_a = entrada.nextFloat();
        }

        System.out.print("\nDigite a porcentagem anual de crescimento anual da cidade B");
        cres_b = entrada.nextFloat();

        while(cres_b <= 0){
            System.out.println("\nCrescimento não existe ou nunca irá ultrapassar. Digite novamente: ");
            cres_b = entrada.nextFloat();
        }

        System.out.println("\n Digite a população de pessoas da cidade A e B");
        hab1 = entrada.nextInt();
        
        hab2 = entrada.nextInt();
        

        cres_a /= 100;
        cres_b /= 100;


        while(hab1 != hab2){
            hab1 += (hab1 * cres_a);
            hab2 += ( hab2* cres_b);
            anos++;


        }
        System.out.printf("Demorou %d anos para as populações se igualarem", anos);

        entrada.close();

    }


}