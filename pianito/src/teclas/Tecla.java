package teclas;

import java.awt.*;

public abstract class Tecla implements Pulsable, Medible{
    protected Point posicion;
    private int nota;
    private boolean pulsada;
    private Color colorPulsada;
    private Graphics graphics;
    Tecla(int n){
        this.posicion = null;
        this.nota = n;
        this.pulsada = false;
        this.colorPulsada = null;
    }
    public int getNumeroNota(){
        return this.nota;
    }
    protected abstract int[] getVerticexX();
    protected abstract int[] getVerticexY();

}
