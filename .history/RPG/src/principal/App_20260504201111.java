package principal;
import java.util.Random;
import java.util.Scanner;

import personagens.Player;
import personagens.classes.Barbaro;
import personagens.classes.Bardo;
import personagens.classes.Mago;
import personagens.classes.Paladino;
import personagens.racas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bem vindos ao RPG de console!");
        System.out.println("Escolha sua classe:\n[1] para paladino\n[2] para mago\n[3] para Bardo\n[4] para Barbaro\n");
        System.out.print("> ");
        int opt0 = sc.nextInt();
        int numR;
        Player player = new Player();
        System.out.println("Digite seu nome: ");
        System.out.print("> ");
        player.nome = sc.next();
        switch(opt0){
            case 1:
                Paladino paladino = new Paladino();
                numR = random.nextInt(4);
                switch(numR){
                    case 0:
                        Humano humanoP = new Humano();
                        paladino.humano = humanoP;
                        break;
                    case 1:
                        Elfo elfoP = new Elfo();
                        paladino.elfo = elfoP;
                        break;
                    case 2:
                        Anao anaoP = new Anao();
                        paladino.anao = anaoP;
                        break;
                    case 3:
                        Goblin goblinP = new Goblin();
                        paladino.goblin = goblinP;
                        break;
                }
                player.paladino = paladino;
                inGame(player);
                break;
            case 2:
                Mago mago = new Mago();
                numR = random.nextInt(4);
                switch(numR){
                    case 0:
                        Humano humanoP = new Humano();
                        mago.humano = humanoP;
                        break;
                    case 1:
                        Elfo elfoP = new Elfo();
                        mago.elfo = elfoP;
                        break;
                    case 2:
                        Anao anaoP = new Anao();
                        mago.anao = anaoP;
                        break;
                    case 3:
                        Goblin goblinP = new Goblin();
                        mago.goblin = goblinP;
                        break;
                }
                player.mago = mago;
                inGame(player);
                break;
            case 3:
                Bardo bardo = new Bardo();
                numR = random.nextInt(4);
                switch(numR){
                    case 0:
                        Humano humanoP = new Humano();
                        bardo.humano = humanoP;
                        break;
                    case 1:
                        Elfo elfoP = new Elfo();
                        bardo.elfo = elfoP;
                        break;
                    case 2:
                        Anao anaoP = new Anao();
                        bardo.anao = anaoP;
                        break;
                    case 3:
                        Goblin goblinP = new Goblin();
                        bardo.goblin = goblinP;
                        break;
                }
                player.bardoardo = bardo;
                inGame(player);
                break;
            case 4: 
                Barbaro barbaro = new Barbaro();
                numR = random.nextInt(4);
                switch(numR){
                    case 0:
                        Humano humanoP = new Humano();
                        barbaro.humano = humanoP;
                        break;
                    case 1:
                        Elfo elfoP = new Elfo();
                        barbaro.elfo = elfoP;
                        break;
                    case 2:
                        Anao anaoP = new Anao();
                        barbaro.anao = anaoP;
                        break;
                    case 3:
                        Goblin goblinP = new Goblin();
                        barbaro.goblin = goblinP;
                        break;
                }
                player.barbaro = barbaro;
                inGame(player);
                break;
            default:
                System.out.println("Você viveu uma vida triste e sem aventuras.\nGame Over!");
                break;
        }
    }
    public static void inGame(Player player1){
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;
        while (gameOver == false) {
            System.out.println("Digite\n[1] Perfil\n[2] Aventurar");
            System.out.print("> ");
            int opt1 = sc.nextInt();
            switch(opt1){
                case 1:
                    System.out.println("-----Perfil-----\nNome: "+ player1.nome +"\nClasse: " +  +"\nRaça: ");
                    break;
                case 2:
                    System.out.println("!!!EM CONSTRUÇÃO!!!");
                    break;
            }
        }
    }
}
