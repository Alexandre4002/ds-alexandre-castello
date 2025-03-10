public class testesconversao{
    public static void main(String[] args)
    {
    Scanner nota1 = new Scanner(System.in);
    Scanner nota2 = new Scanner(System.in);
    Scanner nota3 = new Scanner(System.in);
    String digite1;
    String digite2;
    String digite3;
    double mediaNota = (nota1 + nota2 + nota3) / 3;
    int notaFinal = (int) mediaNota;
    String palavra = "sua nota no bimestre é ";

    System.out.println("Diga a primeira nota"); 
    digite1 = nota1.nextline();

    System.out.println("A primeira nota é: " + digite1);

    System.out.println("Diga a segunda nota");    
    digite2 = nota2.nextline();

    System.out.println("A segunda nota é: " + digite2);

    System.out.println("Diga a terceira nota");
    digite3 = nota3.nextline();

    System.out.println("A terceira nota é: " + digite3);
    System.out.println(mediaNota);
    System.out.println(palavra + notaFinal); 
    }
}
