import java.util.Scanner;
public class Ex50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 5;
        final int IA = 2;

        float[] altura = new float[TAM];
        int[] idade = new int[TAM];

        float[] m_velho = new float[IA], m_novo = new float[IA];
        float[] m_alto = new float[IA], m_baixo = new float[IA];
        
        for(int i = 0; i < TAM; i++){
            System.out.print("Digite sua altura: ");
            altura[i] = entrada.nextFloat();
            System.out.print("\nDigite sua idade: ");
            idade[i] = entrada.nextInt();

            if(i == 0){

                for(int k = 0; k < IA; k++){
                    if(k == 0){
                        m_alto[k] = altura[i];
                        m_baixo[k] = altura[i];
                        m_velho[k] = altura[i];
                        m_novo[k] = altura[i];
                    } else if (k > 0) {
                        m_alto[k] = idade[i];
                        m_baixo[k] = idade[i];
                        m_velho[k] = idade[i];
                        m_novo[k] = idade[i];

                    }
                }

            } else{

                if(altura[i] < m_baixo[0]){
                    m_baixo[0] = altura[i];
                    m_baixo[1] = idade[i];
                } else if(altura[i] > m_alto[0]){
                    m_alto[0] = altura[i];
                    m_alto[1] = idade[i];
                };
                 
                if(idade[i] > m_velho[1]){
                    m_velho[0] = altura[i];
                    m_velho[1] = idade[i];
                } else if(idade[i] < m_novo[1]){
                    m_novo[0] = altura[i];
                    m_novo[1] = idade[i];
                }

                

            }
        }


        for(int i = TAM - 1; i >=0; i--){
            System.out.printf("%.2f | %d\n", altura[i], idade[i]);
        }


        System.out.printf("Mais alto: idade = %.0f | altura = %.2f\n", m_alto[1], m_alto[0]);
        System.out.printf("Mais baixo: idade = %.0f | altura = %.2f\n", m_baixo[1], m_baixo[0]);
        System.out.printf("Mais velho: idade = %.0f | altura = %.2f\n", m_velho[1], m_velho[0]);
        System.out.printf("Mais novo: idade = %.0f | altura = %.2f\n", m_novo[1], m_novo[0]);

        entrada.close();
        
    }
    
}
