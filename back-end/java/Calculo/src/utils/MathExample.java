package utils;

public class MathExample {

    public static int myFirstFunction(int variable){

        return variable * 3;
    }

    public static double somatoria(int x){

        double soma = 0;

        for(int i = 0; i <= x; i++){

            soma += x * 3;
        }

        return soma;
    }

    public static double produtoria(int x, int y){

        double multiplica = 1;

        for(int i = 0; i <= x; i++){
            multiplica *= somatoria(x) * 3 * y;
        }

        return multiplica;
    }
}
