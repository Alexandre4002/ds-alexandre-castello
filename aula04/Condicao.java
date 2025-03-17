import java.util.Scanner;

public class Condicao {
  public static void main(String[] args) {
   
    Scanner numero1 = new Scanner(System.in);
    System.out.println("digite o primeiro numero");
    int digite1 = numero1.nextInt();
    Scanner numero2 = new Scanner(System.in);
    System.out.println("digite o segundo numero");
    int digite2 = numero2.nextInt();


    numero1.close();
    numero2.close();

    if (digite1 > digite2){
    System.out.println(digite1 + " maior que " + digite2);
    }
    if (digite1 == digite2)
    {
        System.out.println(digite1 + " é igual que " + digite2);
    }
    else{
    System.out.println(digite1 + " menor que " + digite2);
    }
   
  }
}