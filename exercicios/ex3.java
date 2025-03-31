import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o comprimento do lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado c: ");
        double c = scanner.nextDouble();

        if (b > a) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (c > a) {
            double temp = a;
            a = c;
            c = temp;
        }
        if (c > b) {
            double temp = b;
            b = c;
            c = temp;
        }

        System.out.printf("\nLados ordenados: a = %.2f, b = %.2f, c = %.2f\n", a, b, c);

        
        if (a >= b + c) {
            System.out.println("Não formam triângulo algum.");
        } else {
           
            if (a * a == b * b + c * c) {
                System.out.println("Formam um triângulo retângulo.");
            } else if (a * a > b * b + c * c) {
                System.out.println("Formam um triângulo obtusângulo.");
            } else if (a * a < b * b + c * c) {
                System.out.println("Formam um triângulo acutângulo.");
            }

       
            if (a == b && b == c) {
                System.out.println("Formam um triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Formam um triângulo isósceles.");
            }
        }
    }
}