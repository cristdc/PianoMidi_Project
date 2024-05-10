package programa;

import teclas.Tecla;

import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;

    public PianoSencillo(int teclaInicial, int teclaFinal){
        super(teclaInicial,teclaFinal);
        this.teclas = new HashMap<>();
        for (int i = teclaInicial; i<teclaFinal; i++){
            teclas.put(i, teclas.get(i));
        }

    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return this.teclas.get(nota);
    }

    @Override
    public void dibujar() {
        int ancho = 0;
        for (int i = getTeclaInicial(); i<getTeclaFinal(); i++){
            teclas.get(i).setGraphics(this.graphics);
            teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);
            teclas.get(i).dibujar();
            ancho+=teclas.get(i).getAnchura();
        }
    }

}
