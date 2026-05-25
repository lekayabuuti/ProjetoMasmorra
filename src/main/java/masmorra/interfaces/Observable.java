package masmorra.interfaces;

import masmorra.TipoEvento.TipoEvento;

public interface Observable {
    void registrar(Observer observer);
    void remover(Observer observer);
    void notificar(TipoEvento evento);
}
