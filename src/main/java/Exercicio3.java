import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        //Declarando Scanner
        Scanner valor = new Scanner(System.in);

        int NPA = valor.nextInt();

        if(NPA < 60)
        {
            System.out.println("Aluno de NP3");
            int NP3 = valor.nextInt();
            int NFA = (NPA + NP3)/2;

            if(NFA >= 50)
            {
                System.out.println("Parabéns, aluno aprovado, nota final = " +NFA
                );
            }

            else
            {
                System.out.println("Aluno reprovado, nota final = " +NFA);
            }
        }

        else
        {
            System.out.println("Aluno aprovado");
        }
    }
}
