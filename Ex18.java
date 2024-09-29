import java.util.Scanner;

public class Ex18 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, cont = 0;

        while(cont < 20){
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            if((num % 2) != 0  && (num % 1) == 0 && (num % num) == 0){
                System.out.println("Primo");
            } else {
                System.out.println("Não primo");

                for(int i = 1; i <= num; i++){
                    if((num % i == 0)){
                        System.out.printf("%d é divisível por %d\n", num, i);
                    };
                };
            };
        };
        entrada.close();
    }

    
}
