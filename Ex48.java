import java.util.Scanner;
public class Ex48 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] data = new int[3];

        System.out.print("Digite uma data. Primeiro o dia");
        data[0] = entrada.nextInt();
        while(data[0] < 0 || data[0] > 31){
            System.out.print("\nInválido! Digite novamente: ");
            data[0] = entrada.nextInt();
        };
        System.out.print("\nO mês");
        data[1] = entrada.nextInt();


        while(data[1] < 0 || data[1] > 12){
            System.out.print("\nInválido! Digite novamente: ");
            data[1] = entrada.nextInt();
        };



        System.out.print("Digite o ano: ");
        data[2] = entrada.nextInt();

        while(data[2] < 0){
            System.out.print("Ano negativo. Não pode: ");
            data[2] = entrada.nextInt();
        }

        if((data[1] == 2 && data[0] > 29)  && ((data[2] % 4 == 0 && (data[2] % 100) != 0) || (data[2] % 400) == 0)){
            System.out.print("Ano bissexto. Digite o dia novamente");
            data[0] = entrada.nextInt();

            while(data[1] > 29 || data[1] < 0){
                System.out.print("Digite o dia novamente");
                data[0] = entrada.nextInt();

            }

        }

        while(data[1] == 2 && data[0] > 29){
            System.out.print("Digite o dia novamente");
            data[0] = entrada.nextInt();

        }

        System.out.printf("%d/%d/%d", data[0], data[1], data[2]);

        entrada.close();

        
    }
    
}
