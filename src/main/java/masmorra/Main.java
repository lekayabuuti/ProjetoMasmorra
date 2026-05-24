package masmorra;
import masmorra.model.Heroi;
import masmorra.observers.*;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Heroi heroi = new Heroi("Aldric");

        System.out.println("=== A MASMORRA REAGE ===");
        System.out.println("Observers registrados: HUD, Nível, Poção, Log\n");

        int turno = 1;

       while (heroi.getVida() > 0) {
           System.out.println("TURNO: " + turno);


           System.out.println("Rodando dado... ");
            int numeroAleatorio = (int) (Math.random() * 4) + 1;
           System.out.println("Resultado do dado: " + numeroAleatorio);

            switch (numeroAleatorio) {
                case 1 -> heroi.receberDano();
                case 2 -> heroi.curar();
                case 3 -> heroi.ganharExperiencia();
                case 4 -> heroi.gastarMana();
                default -> System.out.println("Opção inválida.");
            }

            System.out.println("\nPressione ENTER para passar o turno...");
            scanner.nextLine();

            turno++;
        }

        if (heroi.getVida() == 0) {
            System.out.println("\n>>> Aldric caiu. Fim de jogo.");
        }

        System.out.println("\n=== FIM DA SESSÃO ===");
        scanner.close();
    }
}
