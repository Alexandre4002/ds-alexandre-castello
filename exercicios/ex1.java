import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor que o funcionário recebe por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite o número de filhos com idade inferior a 14 anos: ");
        int numFilhos = scanner.nextInt();

        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        int tempoServico = scanner.nextInt();

        System.out.print("Digite o valor do salário família por filho: ");
        double salarioFamiliaPorFilho = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * valorPorHora;

        
        double descontoINSS = salarioBruto * 0.085;

        double salarioFamilia = numFilhos * salarioFamiliaPorFilho;

        double ir = 0;
        if (salarioBruto > 1500) {
            ir = salarioBruto * 0.15;
        } else if (salarioBruto >= 500) {
            ir = salarioBruto * 0.08;
        }

        double adicional = 0;
        if (idade > 40) {
            adicional = salarioBruto * 0.02;
        } else if (tempoServico > 15) {
            adicional = salarioBruto * 0.035;
        } else if (tempoServico > 5 && idade > 30) {
            adicional = salarioBruto * 0.015;
        }

        double totalDescontos = descontoINSS + ir;
        double salarioLiquido = salarioBruto - totalDescontos + salarioFamilia + adicional;

        System.out.println("\nNúmero do Funcionário: " + nome);
        System.out.printf("Salário Bruto: R$%.2f\n", salarioBruto);
        System.out.printf("Total de Descontos (INSS + IR): R$%.2f\n", totalDescontos);
        System.out.printf("Adicional: R$%.2f\n", adicional);
        System.out.printf("Salário Líquido: R$%.2f\n", salarioLiquido);
    }
}