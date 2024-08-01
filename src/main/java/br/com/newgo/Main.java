package br.com.newgo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo triangle = new Triangulo(0, 0, 0, 0, 0);

        System.out.println("Escolha o método de cálculo de área:");
        System.out.println("1. Base e Altura");
        System.out.println("2. Fórmula de Heron");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a base: ");
            triangle.setBase(scanner.nextDouble());
            System.out.print("Digite a altura: ");
            triangle.setAltura(scanner.nextDouble());
            System.out.println("Área: " + triangle.calcularAreaBaseAltura());
        } else if (escolha == 2) {
            System.out.print("Digite o lado A: ");
            triangle.setLadoA(scanner.nextDouble());
            System.out.print("Digite o lado B: ");
            triangle.setLadoB(scanner.nextDouble());
            System.out.print("Digite o lado C: ");
            triangle.setLadoC(scanner.nextDouble());
            System.out.println("Área: " + triangle.calculateAreaHeron());
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}