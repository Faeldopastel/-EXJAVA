import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        char sexo, es;
        float sal;
        int idade;


        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        while(nome.length() < 3){
            System.out.print("\nNome muito pequeno. Digite novamente: ");
            nome = entrada.nextLine();

        }

        System.out.print("digite sua idade: ");
        idade = entrada.nextInt();

        while(idade <0 || idade > 150){
            System.out.print("\nFora dos parâmetros. Digite novamente: ");
            idade = entrada.nextInt();
        }

        System.out.print("Digite seu salário: ");
        sal = entrada.nextFloat();

        while(sal < 0){
            System.out.print("\nSalário negativo. Digite novamente: ");
            sal = entrada.nextFloat();
        };
        entrada.nextLine();

        System.out.print("Digite seu sexo F ou M: ");
        sexo = entrada.nextLine().charAt(0);
        sexo = Character.toLowerCase(sexo);
        
        

        while(sexo != 'f' && sexo != 'm' ){
            System.out.print("Fora do mostrado. Digite novamente: ");

            sexo = entrada.nextLine().charAt(0);
            sexo = Character.toLowerCase(sexo);
        }
        
        System.out.print("Digite seu estado Civil.\nCasado = C\n Solteiro = S\n Viúvo = V\nDivorciado = D:  ");
        es = entrada.nextLine().charAt(0);
        es = Character.toLowerCase(es);

        while(es != 'c' && es != 's' && es != 'v' && es != 'd' ){
            System.out.print("Fora do mostrado. Digite novamente: ");

            es = entrada.nextLine().charAt(0);
            es = Character.toLowerCase(es);
        }

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sal);
        System.out.println(sexo);
        System.out.println(es);
            
        
        entrada.close();
    }
    
}
