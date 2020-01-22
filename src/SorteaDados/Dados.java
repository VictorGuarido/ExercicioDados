package SorteaDados;

import javax.crypto.spec.PSource;
import java.util.Random;

public class Dados {
    private int lados;
    private int qntJogadas;

    public Dados(int lados, int qntJogadas) {
        this.lados = lados;
        this.qntJogadas = qntJogadas;
    }
    public int getQntJogadas() {
        return qntJogadas;
    }
    public void setQntJogadas(int qntJogadas) {
        this.qntJogadas = qntJogadas;
    }
    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }


    public void jogar(int lados, int qntJogadas){
        Random sortear = new Random();

        int n = 0;

        for(int i = 0; i < qntJogadas; i++) {
            int numero = sortear.nextInt(lados) + 1;

            n += numero;
            System.out.println(numero);
        }

        System.out.println("A soma total é: " + n);
    }
}
