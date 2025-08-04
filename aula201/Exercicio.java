import java.util.Scanner;
public class Exercicio{
    public static void main(String[] args)
    {
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String digite1 = nome.nextLine();
        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int digite2 = idade.nextInt();
        Scanner email = new Scanner(System.in);
        System.out.println("Digite seu email");
        String digite3 = email.nextLine();

        nome.close();
        idade.close();
        email.close(); 
    }
}