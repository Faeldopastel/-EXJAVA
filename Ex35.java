import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final float CQ = 1.20f;
        final float BS = 1.30f;
        final float BCO = 1.50f;
        final float H = 1.20f;
        final float HBC = 1.30f;
        final float RE = 1.00f;

        float total = 0;
        int cod;
        boolean pedido = true;
        int qtd_cq = 0, qtd_bs = 0, qtd_bco = 0, qtd_h = 0, qtd_hbc = 0, qtd_re = 0;

        System.out.print("Especificações      cod   Preço\n");
        System.out.println("Cachorro quente   100   R$" + CQ);
        System.out.println("Bauru Simples     101   R$" + BS);
        System.out.println("Bauru Com ovo     102   R$" + BCO);
        System.out.println("Hamburguer        103   R$" + H);
        System.out.println("Cheeseburguer     104   R$" + HBC);
        System.out.println("Refrigerante      105   R$" + RE);

        while (pedido == true) {
            System.out.print("Digite o código do produto para adicionar ao carrinho (Digite 0 para acabar): ");
            cod = entrada.nextInt();

            if (cod == 0) {
                break;
            }

            while (cod < 100 || cod > 105) {
                System.out.print("\nFora dos limites. Digite novamante: ");
                cod = entrada.nextInt();
            }

            System.out.print("Digite a quantidade: ");
            if (cod == 100) {
                qtd_cq = entrada.nextInt();
                total += qtd_cq * CQ;

            } else if (cod == 101) {
                qtd_bs = entrada.nextInt();
                total += qtd_bs * BS;

            } else if (cod == 102) {
                qtd_bco = entrada.nextInt();
                total += qtd_bco * BCO;
            } else if (cod == 103) {
                qtd_h = entrada.nextInt();
                total += qtd_h * H;

            } else if (cod == 104) {
                qtd_hbc = entrada.nextInt();
                total += qtd_hbc * HBC;

            } else {
                qtd_re = entrada.nextInt();
                total += qtd_re * RE;

            }

        }

        System.out.print("Especificações    QTD  Preço\n");
        System.out.printf("Cachorro quente   %d   R$%.2f\n", qtd_cq, qtd_cq * CQ);
        System.out.printf("Bauru Simples     %d   R$%.2f\n", qtd_bs, qtd_bs * BS);
        System.out.printf("Bauru Com ovo     %d   R$%.2f\n", qtd_bco, qtd_bco * BCO);
        System.out.printf("Hamburguer        %d   R$%.2f\n", qtd_h, qtd_h * H);
        System.out.printf("Cheeseburguer     %d   R$%.2f\n", qtd_hbc, qtd_hbc * HBC);
        System.out.printf("Refrigerante      %d   R$%.2f\n", qtd_re, qtd_re * RE);
        System.out.println("Total = R$" + total);

        entrada.close();

    }

}
