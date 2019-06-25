package application;

import entities.Textos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entradaUsuario = sc.nextLine();
        Textos texto = new Textos(entradaUsuario);
        System.out.println(texto);
        sc.close();
    }
}
