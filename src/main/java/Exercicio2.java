import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        //Declarando a scanner
        Scanner valor = new Scanner(System.in);

        //Declarando T1
        int t1 = valor.nextInt();
        //Declarando T2
        int t2 = valor.nextInt();
        //Declarando T3
        int t3 = valor.nextInt();
        //Somando
        int t = t1 + t2 + t3;

        //Imprimindo a soma
        System.out.println("Total de Zombies: " +t);
        //Imprimindo a média
        System.out.println("Média de Zombies: " +t/3);

    }
}
