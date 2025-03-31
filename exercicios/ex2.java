import java.util.Scanner;

public class BonusNatal {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do funcionário: ");
        int codigoFuncionario = scanner.nextInt();

        System.out.print("Digite o sexo do funcionário (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0); 

        System.out.print("Digite o tempo de trabalho (em anos): ");
        int tempoTrabalho = scanner.nextInt();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

      
        double bonus = 0;

        if (sexo == 'M' || sexo == 'm') { 
            if (tempoTrabalho > 15) {
                bonus = salario * 0.20; 
            } else {
                bonus = 100; 
            }
        } else if (sexo == 'F' || sexo == 'f') { 
            if (tempoTrabalho > 10) {
                bonus = salario * 0.25;
            } else {
                bonus = 100; 
            }
        } else {
            System.out.println("Sexo inválido. Por favor, insira 'M' ou 'F'.");
            return; 
        }

        
        System.out.printf("O valor do bônus de Natal para o funcionário de código %d é: R$ %.2f\n", codigoFuncionario, bonus);
    }
}