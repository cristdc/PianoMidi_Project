package teclas;

import java.awt.*;

public abstract class Tecla {
    protected Point posicion;
    private int nota;
    private boolean pulsada;
    private Color colorPulsada;
    private Graphics graphics;
    private Tecla(int n){
        throw new UnsupportedOperationException("sin programar");
    }
    public int getNumeroNota(){
        throw new UnsupportedOperationException("sin programar");
    }
    protected abstract int[] getVerticexX();
    protected abstract int[] getVerticexY();

}
