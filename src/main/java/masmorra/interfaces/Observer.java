package masmorra.interfaces;

import masmorra.enumerations.TipoEvento;
import masmorra.model.Heroi;

public interface Observer {
    void atualizar(Heroi heroi, TipoEvento evento);
}
