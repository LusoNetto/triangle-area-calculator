package br.com.newgo;

import java.util.Scanner;

public class CLI {
    public Double lerEntrada(){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        sc.close();
        return Double.parseDouble(entrada);
    }
}
