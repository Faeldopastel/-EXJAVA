public class Ex15 {
    public static void main(String[] args) {
        

        int se = 38;
        float soma = 0;

        for(int i = 1; i < 38; i++){
            System.out.printf("(%d * %d) / %d\n", se, se - 1, i);
            soma += (se * (se - 1)) / i;
            se--;

            
        }

        System.out.println(soma);
    }
    
}
