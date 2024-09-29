import java.util.Scanner;
public class Ex16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, maior = 0, menor = 0, cont = 0, stop, soma = 0;
        boolean paro = true;

        while(paro) {
            System.out.print("Digite um número: ");
            cont++;
            num = entrada.nextInt();

            if(cont == 1){
                maior = num;
                menor = num;
                soma+= num;
            } else{

                soma += num;

                if(num > maior){
                    maior = num;
                } else if(num < menor){
                    menor = num;
                }

                System.out.print("Deseja continuar? 1 para Sim; 2 para não:");
                stop = entrada.nextInt();

                if(stop == 2){
                    paro = false;
                }
            }         
        }
        System.out.println("A soma é "+ soma);
        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);

        entrada.close();
    }
    
}
