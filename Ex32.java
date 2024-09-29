import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 5;

        int carros, num_aci, maior_i = 0, menor_i = 0;
        int cod_cid, med_aci = 0, ci_maior_ac = 0, ci_menor_ac =0, med_car = 0 ;
        int cont_dk = 0 ;

        for(int i = 0; i<TAM; i++){
            System.out.printf("Digite o número de carros da cidade %d", i+1);
            carros = entrada.nextInt();
            System.out.print("\nQual é o código da cidade?: ");
            cod_cid = entrada.nextInt();
            System.out.print("Quantos acidentes ocorreram?: ");
            num_aci = entrada.nextInt();

            if(i == 0){
                med_car += carros;
                if(carros < 2000){
                    med_aci += num_aci; 
                    cont_dk++;
                };
                maior_i = menor_i = num_aci;

            } else {

                if(carros < 2000){
                    med_aci += num_aci;
                    cont_dk++;
                };

                if(num_aci > maior_i){
                    maior_i = num_aci;
                    ci_maior_ac = cod_cid;

                } else if(num_aci < menor_i){
                    menor_i = num_aci;
                    ci_menor_ac = cod_cid;
                };

                med_car+= carros;

            }
        }


        System.out.printf("A média de carros de todas as cidades é %d\n", med_car /5);
        System.out.printf("A média de acidente com menos de 2000 carros as é %d\n", med_aci /cont_dk);
        System.out.printf("O menor índice é %d de acidentes. A cidade %d possui esse feito\n", menor_i, ci_menor_ac);
        System.out.printf("O maior índice é %d de acidentes. A cidade %d possui esse feito\n", maior_i, ci_maior_ac);
        
        
        entrada.close();

    }
    
}
