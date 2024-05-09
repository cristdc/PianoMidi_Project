package programa;

import teclas.Tecla;

import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;

    public PianoSencillo(int teclaInicial, int teclaFinal){
        throw new UnsupportedOperationException("Sin programar");
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return null;
    }

}
