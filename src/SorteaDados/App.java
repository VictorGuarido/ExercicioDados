package SorteaDados;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados do dado: ");
        int ladosDado = in.nextInt();

        System.out.println("Digite a quantas vezes quer jogar: ");
        int jogadas = in.nextInt();

        Dados dado = new Dados(ladosDado, jogadas);

        dado.jogar(ladosDado, jogadas);

    }

}
