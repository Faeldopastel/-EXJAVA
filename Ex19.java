import java.util.Scanner;
public class Ex19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num,cont = 0, contpri = 0;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        for(int i = 1; i <= num; i++){
            if((i%2) != 0 && (i % 1 ) == 0 && (i % i) == 0){
                contpri++;
                cont++;
            } else {
                cont++;
            }
        }

        System.out.printf("\nForam feitas %d divisões e encontrou %d primos", cont, contpri);

        entrada.close();
    }
    
}
