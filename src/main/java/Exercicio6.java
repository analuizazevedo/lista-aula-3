import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10) + 1;
        int xa;
        do {
            xa = valor.nextInt();

            if(xa < x)
            {
                System.out.println("O numero devera ser maior, tente outra vez");
            }

            else if (xa > x)
            {
                System.out.println("O numero devera ser menor, tente outra vez");
            }
        }

        while( x != xa);
        System.out.println("Acertou");
    }
}
