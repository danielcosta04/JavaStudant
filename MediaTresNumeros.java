import java.util.Scanner;

public class MediaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        double media;
        
        // Entrada de dados
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número:");
        num2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro número:");
        num3 = scanner.nextInt();
        
        // Cálculo da média
        media = (num1 + num2 + num3) / 3.0;
        
        // Saída do resultado
        System.out.printf("A média dos números é: %.2f%n", media);
        
        scanner.close();
    }
}