import java.util.Scanner;
public class Ex30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cod = 1, c_alto= 0, c_baixo = 0, c_gordo = 0, c_magro = 0, cont = 0 ;
        float alt, peso, m_alto = 0,m_baixo = 0, gordo = 0, magro = 0, mediaAlt = 0, mediaPeso = 0;

        while(cod != 0){
            cont++;
            System.out.print("Digite seu código. (Digite 0 para parar): ");
            cod = entrada.nextInt();

            if(cod == 0){
                break;
            }
            
            System.out.print("\nDigite sua altura: ");
            alt = entrada.nextFloat();
            System.out.print("\nDigite seu peso");
            peso = entrada.nextFloat();


            if(cont == 1){

                c_alto = c_baixo = c_gordo = c_magro = cod;
                magro = gordo = peso;
                m_alto = m_baixo = alt;
                mediaAlt += alt;
                mediaPeso += peso;

            } else {

                if(alt > m_alto){
                    c_alto = cod;
                    m_alto = alt;

                } else if( alt < m_baixo){
                    c_baixo = cod;
                    m_baixo = alt;
                }

                if(peso > gordo){
                    gordo = peso;
                    c_gordo = cod;
                    
                } else if( peso < magro){
                    magro = peso;
                    c_magro = cod;
                }

                mediaAlt += alt;
                mediaPeso += peso;


            }

        }

        System.out.printf("Media de altura: %.2f\n", mediaAlt / cont);
        System.out.printf("Media de peso: %.2f\n", mediaPeso / cont);
        System.out.printf("O mais alto tem %.2f. Seu codigo é %d\n",m_alto, c_alto);
        System.out.printf("O mais baixo tem %.2f. Seu codigo é %d\n",m_baixo, c_baixo);
        System.out.printf("O mais gordo tem %.2f. Seu codigo é %d\n",gordo, c_gordo);
        System.out.printf("O mais alto tem %.2f. Seu codigo é %d\n",magro, c_magro);

        entrada.close();
    }
    
}
