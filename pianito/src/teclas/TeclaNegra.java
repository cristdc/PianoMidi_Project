package teclas;

import java.awt.*;

public class TeclaNegra extends Tecla{
    public final static int ANCHURA=15;
    public final static int ALTURA=50;

    TeclaNegra(int n){
        super(n);
    }

    @Override
    protected int[] getVerticexX() {
        return new int[]{
                0,
                ANCHURA,
                ANCHURA,
                0
        };
    }

    @Override
    protected int[] getVerticexY() {
        return new int[]{
                0,
                0,
                ALTURA,
                ALTURA
        };
    }

    @Override
    public Color getColorNoPulsado() {
        return Color.BLACK;
    }

    @Override
    public int getAltura() {
        return this.ALTURA;
    }

    @Override
    public int getAnchura() {
        return this.ANCHURA;
    }
}
