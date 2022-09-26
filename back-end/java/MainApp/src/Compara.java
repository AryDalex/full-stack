import java.util.Locale;
import java.util.Scanner;

public class Compara {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt(); // digite um numero

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor de conta = R$%.2f%n", conta);

        sc.close();
    }

}
