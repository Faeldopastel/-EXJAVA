import java.util.Scanner;
public class Ex49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra;
        int tam = 0;

        System.out.print("Digite uma palavra: ");
        palavra = entrada.nextLine();

        for(int i = 0; i< palavra.length(); i ++){
            if(palavra.charAt(i) == ' '){
                tam++;
            }
        }
        String[] div = palavra.split(" ");


        for(int i = 0; i <= tam; i++){
            System.out.println(div[i]);
        }

        entrada.close();
        
    }
    
}
