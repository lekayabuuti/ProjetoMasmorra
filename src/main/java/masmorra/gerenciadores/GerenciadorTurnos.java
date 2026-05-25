package masmorra.gerenciadores;

public class GerenciadorTurnos {

    private static GerenciadorTurnos instancia;
    private int turno = 1;

    private GerenciadorTurnos() {}

    public static GerenciadorTurnos getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorTurnos();
        }
        return instancia;
    }

    public void avancar() { turno++; }
    public int getTurno() { return turno; }
}
