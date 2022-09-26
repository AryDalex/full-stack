import utils.MathExample;

public class Main{

    public static void main(String[] args){

        // MathExample pado = new Math(3);

        for(int i = 0; i < args.length; i++){ /* args.legth -> memoria do vetor */

            System.out.println(args[i]);
        }

        System.out.println("Hello Padolabs!: " + MathExample.myFirstFunction(3));

        System.out.println("Resultado: " + MathExample.somatoria(10));

        System.out.println("Resultado: " + MathExample.produtoria(20, 10));
    }

}
