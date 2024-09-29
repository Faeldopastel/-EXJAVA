import java.util.Scanner;
public class Ex9 {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
        
    int num, ini, fim;

    do{
        
        System.out.print("Digite um número;");
        num = entrada.nextInt();
    } 

    while(num <= 0 || num > 10);

    do{
        System.out.print("Digite o número de inicio e fim da tabuada: ");
        ini = entrada.nextInt();
        fim = entrada.nextInt();
        if(ini < 0 || fim < 0){
            System.out.print("Inicio e fim e não podem ser negativos\n");
        } else if(fim < ini){
            System.out.print("O valor de início não pode ser maior que o do fim:\n ");
        }

    } while((ini < 0 || fim <= 0) || fim < ini);


    for(int i = ini; i <=fim; i++){
        System.out.printf("%d X %d = %d\n", num, i, num *i);
    }

    entrada.close();
    }
}
