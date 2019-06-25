package application;

import entities.Cidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Curitiba", "PR", "é Capital"));
        cidades.add(new Cidade("Maringá", "PR", "Não é capital"));
        cidades.add(new Cidade("Londrina", "PR", "Não é capital"));
        cidades.add(new Cidade("Pinhais", "PR", "Não é capital"));
        cidades.add(new Cidade("Chapeco", "SC", "Não é capital"));
        cidades.add(new Cidade("Joinvile", "SC", "Não é capital"));
        cidades.add(new Cidade("Blumenal", "SC", "Não é capital"));
        cidades.add(new Cidade("Florianópolis", "SC", "é Capital"));
        cidades.add(new Cidade("Porto Alegre", "RS", "é Capital"));
        cidades.add(new Cidade("Gramado", "RS", "Não é capital"));
        Cidade resultado = null;
        String entradaUsuario = sc.nextLine();
        for(Cidade cidade:cidades){
            if(entradaUsuario.equals(cidade.getName())){
                resultado=cidade;
            }
        }
        System.out.println("Pertence ao "+resultado.getEstado()+", "+resultado.getOrdem());


        sc.close();

    }
}
