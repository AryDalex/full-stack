import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {

            System.out.print("Digite a temperatura em Celsius: "); // texto
            double C = sc.nextDouble(); // escreve
            double F = 9.0 * C / 5.0 + 32.0; // formila
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F); // resultado
            System.out.print("Deseja repetir (s/n)? "); // texto
            resp = sc.next().charAt(0); // escreve

        } while (resp != 'n'); // condicao para sair

        sc.close();

    }

}