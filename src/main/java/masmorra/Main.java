package masmorra;
import masmorra.gerenciadores.GerenciadorTurnos;
import masmorra.model.Heroi;
import masmorra.observers.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Heroi heroi = new Heroi("Aldric");
        GerenciadorTurnos turnos = GerenciadorTurnos.getInstance();

        System.out.println("=== A MASMORRA REAGE ===");
        System.out.println("Observers registrados: HUD, Nível, Poção, Log\n");

        while (heroi.getVida() > 0 && turnos.getTurno() <= 15) {
            System.out.println("TURNO: " + turnos.getTurno());
            System.out.println("Rodando dado... ");
            int numeroAleatorio = (int) (Math.random() * 4) + 1;
            System.out.println("Resultado do dado: " + numeroAleatorio);

            switch (numeroAleatorio) {
                case 1 -> heroi.receberDano(25);
                case 2 -> heroi.curar(7);
                case 3 -> heroi.ganharExperiencia(25);
                case 4 -> heroi.gastarMana(5);
                default -> System.out.println("Opção inválida.");
            }

            System.out.println("\nPressione ENTER para passar o turno...");
            scanner.nextLine();

            turnos.avancar();
        }

        if (heroi.getVida() <= 0) {
            System.out.println("\n>>> " + heroi.getNome() + " caiu. Fim de jogo.");
        } else {
            System.out.println("\n>>> " + heroi.getNome() + " ganhou.");
        }

        System.out.println("\n=== FIM DA SESSÃO ===");
        scanner.close();
    }
}
