package teclas;

import java.awt.*;

public abstract class TeclaBlanca extends Tecla{
    public final static int ANCHURA=25;
    public final static int ALTURA=100;

    TeclaBlanca(int n){
        super(n);
    }

    @Override
    public int getAnchura() {
        return this.ANCHURA;
    }

    @Override
    public int getAltura() {
        return this.ALTURA;
    }

    @Override
    public Color getColorNoPulsado() {
        return Color.WHITE;
    }

    @Override
    protected abstract int[] getVerticexX();

    @Override
    protected abstract int[] getVerticexY();
}
