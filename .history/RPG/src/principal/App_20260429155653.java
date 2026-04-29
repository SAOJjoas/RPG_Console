package principal;
import java.util.Scanner;

import classes.Paladino;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindos ao RPG de console!");
        System.out.println("Escolha sua classe:\n[1] para paladino\n[2] para mago\n[3] para Bardo\n[4] para Barbaro\n");
        int opt0 = sc.nextInt();
        switch(opt0){
            case 1:
                Paladino player
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: 
                break;
            default:
                System.out.println("Você viveu uma vida triste e sem aventuras.\nGame Over!");
                break;
        }
    }
}
