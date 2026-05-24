package masmorra.interfaces;

import masmorra.model.Heroi;

public interface Observer {
    void atualizar(Heroi heroi, String evento);
}
