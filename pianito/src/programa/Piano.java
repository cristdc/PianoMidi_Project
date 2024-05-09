package programa;

import teclas.ElementoVisual;
import teclas.Tecla;

import java.awt.*;

public abstract class Piano implements ElementoVisual {
    private int teclaInicial;
    private int teclaFinal;
    Point posicion;
    Graphics graphics;

    public Piano(int ti, int tf){
        this.teclaInicial = ti;
        this.teclaFinal = tf;
    }

    public int getTeclaInicial(){
        return this.teclaInicial;
    }

    public int getTeclaFinal(){
        return this.teclaFinal;
    }

    public abstract Tecla getTecla(int canal, int nota);

    @Override
    public void dibujar() {
        ElementoVisual.super.dibujar();
    }
}
