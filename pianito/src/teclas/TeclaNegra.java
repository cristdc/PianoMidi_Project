package teclas;

import java.awt.*;

public class TeclaNegra extends Tecla{
    public final static int ANCHURA=7;
    public final static int ALTURA=25;

    TeclaNegra(int n){
        super(n);
    }

    @Override
    protected int[] getVerticexX() {
        return new int[]{
                this.posicion.x,
                this.posicion.x+ANCHURA,
                this.posicion.x+ANCHURA,
                this.posicion.x
        };
    }

    @Override
    protected int[] getVerticexY() {
        return new int[]{
                this.posicion.y,
                this.posicion.y,
                this.posicion.y+ALTURA,
                this.posicion.y+ALTURA
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
