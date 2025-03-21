import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        System.out.println("\n--- Calculadora ---\n");

        // Resgatando números
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.printf("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Resgatando operação
        System.out.println("\n--- Operadores ---\n");
        System.out.println("1) Adição (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");
        System.out.print("\nEscolha a operação: ");

        int operacao = scanner.nextInt();

        // Realizando cálculo
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicionar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("\nDivisão por 0 não permitida!");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("\nOperação inválida!");
                scanner.close();
                return;
        }

        // Exibição do resultado
        System.out.println("\nO resultado da operação é: " + resultado);

        // Fechando scanner
        scanner.close();

    }

    // Método para realizar adição
    public static double adicionar(double a, double b) {
        return a + b;
    }

    // Método para realizar subtração
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Método para realizar multiplicação
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para realizar divisão
    public static double dividir(double a, double b) {
        return a / b;
    }

}
