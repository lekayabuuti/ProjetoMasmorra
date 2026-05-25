package masmorra.observers;

import masmorra.enumerations.TipoEvento;
import masmorra.gerenciadores.GerenciadorTurnos;
import masmorra.interfaces.Observer;
import masmorra.model.Heroi;

import java.util.*;

public class LogDeBatalha {

    LinkedHashMap<Integer, StringBuilder> logs = new LinkedHashMap<>();

//implementação do log comentado para facilitar na prática do exercício
//    GerenciadorTurnos turno = GerenciadorTurnos.getInstance();

//        int numeroTurno = turno.getTurno();
//        if (logs.get(numeroTurno) == null) {
//            logs.put(numeroTurno, new StringBuilder());
//            logs.get(numeroTurno).append("======================\n").append("TURNO ").append(numeroTurno).append("\n======================\n");
//        }
//        logs.get(numeroTurno).append("\n[").append(evento).append("]")
//                .append("\nNível: ").append(heroi.getNivel()).append("\nExperiência: ")
//                .append(heroi.getExperiencia()).append("\nMana: ").append(heroi.getMana()).append("\nVida: ").append(heroi.getVida());
//

    public void exibir() {
        System.out.println("\n======================");
        System.out.println("LOGS DE BATALHA");
        System.out.println("======================");
        logs.forEach((integer, stringBuilder) -> System.out.println(stringBuilder));
        System.out.println("======================");
        System.out.println("FIM DOS LOGS");
        System.out.println("======================\n");
    }
}
