import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome, senha;

        do{
            System.out.print("Digite seu login: ");
            nome = entrada.nextLine();
            System.out.print("\nDigite sua senha: ");
            senha = entrada.nextLine();
            senha = senha.toLowerCase();

            if(senha.equalsIgnoreCase(nome)){
                System.out.print("Senha e Login não podem ser iguais\n");

            }
        } while(senha.equalsIgnoreCase(nome));


        System.out.printf("Bem vindo %s", nome);

        entrada.close();
    }
    
}
