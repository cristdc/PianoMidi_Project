package programa;

import teclas.Tecla;

import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;

    public PianoSencillo(int teclaInicial, int teclaFinal){
        super(teclaInicial,teclaFinal);
        this.teclas = new HashMap<>();
        for (int i = 0; i<teclas.size(); i++){
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
        for (Tecla tecla:teclas.values()){
            teclas.get(tecla).setGraphics(this.graphics);
            teclas.get(tecla).setPosicion(posicion.x+ancho, posicion.y);
            tecla.dibujar();
            ancho+=tecla.getAnchura();
        }
    }

}
