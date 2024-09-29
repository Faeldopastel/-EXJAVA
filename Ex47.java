import java.util.Scanner;
public class Ex47 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = entrada.nextLine();

        int tam = palavra.length();
        char[] c = new char[tam];

        for(int i = 0; i < palavra.length(); i++){
            c[i] = palavra.charAt(i);
            System.out.println(c[i]);
        }

        entrada.close();
    }
    
}
