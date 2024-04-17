package test;

public class Q4 {
    public static void main (String[]args){
int i;
int j;

        for( i=1 ; i<= 9; i++) {
            System.out.printf("=====단%n", i );
            for( j=1 ; j<= 9; j++) {

                if ( i> j) {
                    continue;
                }

                System.out.printf ("%d * %d = %d%n", i , j, i*j);
            }
        }
    }
}
