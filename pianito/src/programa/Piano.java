package programa;

import java.awt.*;

public class Piano {
    private int teclaInicial;
    private int teclaFinal;
    Point posicion;
    Graphics graphics;

    public Piano(int ti, int tf){
        throw new UnsupportedOperationException("Sin programar");
    }

    public int getTeclaInicial(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public int getTeclaFinal(){
        throw new UnsupportedOperationException("Sin programar");
    }

    public abstract Tecla getTecla(int canal, int nota){
        throw new UnsupportedOperationException("Sin programar");
    }
}
