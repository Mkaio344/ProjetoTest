import java.util.Scanner;

public class test1 {
// FAÇA UM PROGAMA QUE PERGUNTE NOME, PESO, IDADE, ALTURA E CALCULE O IMC DE UMA PESSOA:

    public static void main (String[] args){
        Scanner test1 = new Scanner (System.in);
        System.out.println("qual seu nome:");
            String n1 = test1.next();
        System.out.println("qual sua idade?");
            int n2 = test1.nextInt();
        System.out.println("qual seu peso?");
            double n3 = test1.nextDouble();
        System.out.println("qual sua altura?");
            double n4 = test1.nextDouble();

            double IMC = n3 / (n4*n4);
        System.out.println(IMC);

    }
}
