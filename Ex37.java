import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 10;

        String login_prof, senha_prof;
        char[] gabarito = new char[TAM]; // professor

        String nome_aluno;
        String maior_acerto = "", menor_acerto = ""; // aluno
        char resp;

        int acerto = 0, comecar, media = 0, cont_a = 0;
        int melhor = 0, pior = 0;
        boolean termino = true;

        System.out.println("Bem Vindo. Digite seu Login e senha: ");
        System.out.print("Login: ");
        login_prof = entrada.nextLine();
        System.out.print("\nSenha: ");
        senha_prof = entrada.nextLine();

        while (login_prof.isEmpty() || senha_prof.isEmpty()) {
            System.out.print("Login e/ou senhas não correspondem\n");
            System.out.print("Login: ");
            login_prof = entrada.nextLine();
            System.out.print("\nSenha: ");
            senha_prof = entrada.nextLine();
        }

        System.out.print("\nAdicione o gabarito: ");

        for (int i = 0; i < TAM; i++) {
            System.out.printf("Gabarito da questão (%d): ", i + 1);
            gabarito[i] = entrada.nextLine().charAt(0);
        }

        System.out.print("Deseja começar a prova? 1 - sim; 2 - não");
        comecar = entrada.nextInt();

        while (comecar < 1 || comecar > 2) {
            System.out.print("\nDigite novamente ");
            comecar = entrada.nextInt();
        }

        entrada.nextLine();

        if (comecar == 1) {
            termino = false;

            while (termino == false) {
                System.out.printf("Digite seu nome: ");
                nome_aluno = entrada.nextLine();
                cont_a++;
                acerto = 0;

                for (int i = 0; i < TAM; i++) {
                    System.out.print("\nDigite a resposta da questão " + (i + 1));
                    resp = entrada.nextLine().charAt(0);

                    if (resp == gabarito[i]) {
                        acerto++;
                    }
                    ;
                }

                media += acerto;

                if (cont_a == 1) {
                    maior_acerto = nome_aluno;
                    menor_acerto = nome_aluno;
                    melhor = pior = acerto;

                    System.out.print("Deseja continuar? 1 - sim; 2 - não");
                    comecar = entrada.nextInt();

                    while (comecar < 1 || comecar > 2) {
                        System.out.print("\nDigite novamente ");
                        comecar = entrada.nextInt();
                    }

                    entrada.nextLine();

                    if(comecar == 2){
                        termino = true;
                    }

                } else {

                    if (acerto > melhor) {
                        melhor = acerto;
                        maior_acerto = nome_aluno;
                    } else if (acerto < pior) {
                        pior = acerto;
                        menor_acerto = nome_aluno;
                    }

                    System.out.print("Deseja continuar? 1 - sim; 2 - não");
                    comecar = entrada.nextInt();

                    while (comecar < 1 || comecar > 2) {
                        System.out.print("\nDigite novamente ");
                        comecar = entrada.nextInt();
                    }

                    entrada.nextLine();

                    if(comecar == 2){
                        termino = true;
                        
                    }
                }
            }

        } else {
            System.out.print("Sistema encerrado");
        }

        media /= cont_a;

        System.out.printf("Aluno com maior acerto: %s\n", maior_acerto);
        System.out.printf("Aluno com menor acerto %s\n", menor_acerto);
        System.out.printf("Média da turma %.2f", (float) media);


        

        entrada.close();

    }

}
