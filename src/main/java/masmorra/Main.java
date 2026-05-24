package masmorra;
import masmorra.model.Heroi;
import masmorra.interfaces.Observer;
import masmorra.observers.*;

import java.util.Scanner;

public class Main {

     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Heroi heroi = new Heroi("Aldric");

        InterfaceDeCombate hud    = new InterfaceDeCombate();
        SistemaDeNivel nivel      = new SistemaDeNivel();
//        PocaoDeEmergencia pocao   = new PocaoDeEmergencia(2);
        LogDeBatalha log          = new LogDeBatalha();

//        heroi.registrar(hud);
//        heroi.registrar(nivel);
//        heroi.registrar(pocao);
//        heroi.registrar(log);

        System.out.println("=== A MASMORRA REAGE ===");
        System.out.println("Observers registrados: HUD, Nível, Poção, Log\n");

        int turno = 1;

//        while (heroi.getVida() > 0) {

            // zona silenciosa a partir do turno 4
            if (turno == 4) {
                System.out.println("\n>>> Você entrou na zona silenciosa. HUD desconectada.\n");
//                heroi.remover(hud);
            }

            System.out.println("-------- Turno " + turno + " --------");
//            System.out.println("Vida: " + heroi.getVida() +
//                    " | Mana: " + heroi.getMana() +
//                    " | Nível: " + heroi.getNivel() +
//                    " | XP: " + heroi.getExperiencia());
            System.out.println();
            System.out.println("1. Receber dano");
            System.out.println("2. Curar");
            System.out.println("3. Ganhar experiência");
            System.out.println("4. Gastar mana");
            System.out.println("5. Exibir log");
            System.out.println("0. Sair");
            System.out.print("\n> ");

            int opcao = scanner.nextInt();

//            if (opcao == 0) break;

            System.out.print("Quantidade: ");
            int qty = scanner.nextInt();

//            switch (opcao) {
//                case 1 -> heroi.receberDano(qty);
//                case 2 -> heroi.curar(qty);
//                case 3 -> heroi.ganharExperiencia(qty);
//                case 4 -> heroi.gastarMana(qty);
//                case 5 -> { log.exibir(); continue; }
//                default -> System.out.println("Opção inválida.");
//            }

            turno++;
        }

//        if (heroi.getVida() == 0) {
//            System.out.println("\n>>> Aldric caiu. Fim de jogo.");
//        }

//        System.out.println("\n=== FIM DA SESSÃO ===");
//        log.exibir();
//        scanner.close();
//    }
}
