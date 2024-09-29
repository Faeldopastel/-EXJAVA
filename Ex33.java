import java.util.Scanner ;
public class Ex33 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final int PAR = 3;
        final int TAM = 4;

        float valor, valor_divida = 0, juros = 0;
        int parcela = 1;

        System.out.print("Digite o valor da dívida: ");
        valor = entrada.nextFloat();
        valor_divida = valor;
        System.out.print("Valor da Dívida  Valor dos Juros  Quantidade de Parcelas Valor da Parcela\n");
        for(int i = 1; i <=TAM; i++){

        System.out.printf("R$ %.2f          %.2f                 %d                   R$%.2f\n", valor_divida, (valor * juros), parcela, valor_divida / parcela);
        parcela = i * PAR;

        if(parcela == PAR){
            juros = (float) 10 / 100;
            valor_divida =  (float) valor + (valor * juros);
        } else {
            juros += (float) 5 / 100;
            valor_divida = (float) valor + (valor * juros);
        };



        }

        entrada.close();

        
        
    }
    
}
