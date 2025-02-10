package montyhall;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int qtd = 10;

        int naoTroca = 0;
        int troca = 0;

        for (var i = 0; i < qtd; i++) {
            var game = new Game(new Random().nextInt(3) + 1, false);
            var result = game.play();
            if (result)
                naoTroca++;
        }

        for (var i = 0; i < qtd; i++) {
            var game = new Game(new Random().nextInt(3) + 1, true);
            var result = game.play();
            if (result)
                troca++;
        }

        System.out.println("Troca    : " + (double) troca / qtd);
        System.out.println("Não troca: " + (double) naoTroca / qtd);
    }
}
