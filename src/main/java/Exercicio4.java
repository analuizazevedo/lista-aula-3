import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        //Declarando scanner
        Scanner valor = new Scanner(System.in);

        int sala = valor.nextInt();

        switch (sala)
        {
            case 10:
                System.out.println("Sala I-15");
                break;

            case 20:
                System.out.println("Sala I-15");
                break;

            case 30:
                System.out.println("Sala I-22");
                break;

            default:
                System.out.println("Nenhuma das salas");
        }
    }
}
