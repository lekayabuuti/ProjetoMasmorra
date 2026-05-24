package masmorra.interfaces;

public interface Observable {
    void registrar(Observer observer);
    void remover(Observer observer);
    void notificar(String evento);
}
