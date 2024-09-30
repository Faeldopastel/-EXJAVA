import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int PROV = 2;

        int alunos;

        System.out.print("Digite a quantidade de alunos: ");
        alunos = entrada.nextInt();
        entrada.nextLine();

        final int TAM = alunos;

        String[] nomes = new String[TAM];
        float[][] notas = new float[TAM][PROV];
        float[] media = new float[TAM];
        float menor_n = 0, maior_n = 0;
        float maior_m = 0, menor_m = 0;
        float media_g = 0;
        String nome_maior_n = "", nome_menor_n = "", nome_maior_m = "", nome_menor_m = "";

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite seu nome: ");
            nomes[i] = entrada.nextLine();
            for (int k = 0; k < PROV; k++) {
                System.out.printf("\nDigite a nota da prova(%d): ", k + 1);
                notas[i][k] = entrada.nextFloat();
                media[i] += notas[i][k];

                if (k == 0 && i == 0) {
                    maior_n = notas[i][k];
                    menor_n = notas[i][k];
                    nome_maior_n = nomes[i];
                    nome_menor_n = nomes[i];
                } else {

                    if (notas[i][k] > maior_n) {
                        maior_n = notas[i][k];
                        nome_maior_n = nomes[i];
                    } else if (notas[i][k] < menor_n) {
                        menor_n = notas[i][k];
                        nome_menor_n = nomes[i];
                    }
                }

            }
            entrada.nextLine();
            media_g += media[i];
            media[i] /= PROV;

            if (i == 0) {
                maior_m = media[i];
                nome_maior_m = nomes[i];
                menor_m = media[i];
                nome_menor_m = nomes[i];
            } else {

                if (media[i] > maior_m) {
                    maior_m = media[i];
                    nome_maior_m = nomes[i];
                } else if (media[i] < menor_m) {
                    menor_m = media[i];
                    nome_menor_m = nomes[i];
                }
            }

        }
        media_g /= (TAM * PROV);

        for (int i = 0; i < TAM; i++) {
            System.out.printf("Notas do(a) %s", nomes[i]);
            for (int k = 0; k < PROV; k++) {
                System.out.print(" " + notas[i][k]);
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("Abaixo da média geral: ");
        for (int i = 0; i < TAM; i++) {
            if (media[i] < media_g) {
                System.out.println(nomes[i]);
            }
        }
        System.out.println("Acima da média geral: ");
        for (int i = 0; i < TAM; i++) {
            if (media[i] > media_g) {
                System.out.println(nomes[i]);
            }
        }

        System.out.printf("Aluno com maior média (%s) com %.2f\n", nome_maior_m, maior_m);
        System.out.printf("Aluno com menor média (%s) com %.2f\n", nome_menor_m, menor_m);
        System.out.printf("Aluno com maior nota (%s) com %.2f\n", nome_maior_n, maior_n);
        System.out.printf("Aluno com menor nota (%s) com %.2f\n", nome_menor_n, menor_n);
        System.out.printf("Média da turma = %.2f\n", media_g);

        entrada.close();
    }

}
