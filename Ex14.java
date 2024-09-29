public class Ex14 {
    public static void main(String[] args) {

        int m = 1;
        float s = 0 ;
        
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d/%d + ",i,m);
            s +=  (float) i/m;
            m += 2;

            

        };
        System.out.println(s);


    }
    
}
