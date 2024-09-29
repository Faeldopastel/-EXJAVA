import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numt , numa, total = 0;
        
        System.out.print("Digite o número de turmas: ");
        numt = entrada.nextInt();

       for(int i = 1; i <= numt; i++){
    
           System.out.printf("\nDigite o número de alunos por turma (%d); ", i);
           numa = entrada.nextInt();
           while(numa > 40){
             System.out.printf("\nNúmero de alunos por turma não pode passar de 40 ");
              numa = entrada.nextInt();
            }
            total += numa;
       }

       total /= numt;

       while(total > 40){
         System.err.println("Não há turmas suficientes");
         numt++;

         total/= numt;
       }

       System.out.printf("Vai em média %d alunos por sala\n Precisando de no total %d turmas ", total, numt);
       entrada.close();
    



    }
    
}
