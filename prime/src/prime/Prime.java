package prime;

/**
 * @Henderson Computer Science UIL team
 */
public class Prime {

    
    public static void main(String[] args) {
        int number = 7;
        int p = 0;
        for (int i = 2; i < number/2; i++) {
            if(number % i == 0){
                for (int j = 2; j < i; j++) {
                    if (!(i%j==0)) {
                        if(p<number){
                            System.out.println(number);
                        }
                    }
                }
            }
        }
    }

}
