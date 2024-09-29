public class Ex12 {

    public static void main(String[] args) {
        
        int ant, at, prox;

        ant = 0;
        at = 1;
        System.out.println("1");

        for(int i = 0; i < 10; i++){
            prox = ant + at;
            ant = at;
            at = prox;
            System.out.println(at);

        };


    }
    
}
