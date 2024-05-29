import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa irá ler um valor e imprimir na tela o valor com um reajuste de 5%\n\nDigite o número desejado: ");
        float number = sc.nextFloat();
        float reajuste = number * 5/100;
        System.out.println("Com o reajuste de 5% ficará: "  + (number + reajuste));
    }
}
