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

    @Override
    public void setGraphics(Graphics g) {
        this.graphics = g;
    }

    @Override
    public void setPosicion(int x, int y) {
        this.posicion = new Point(x, y);
    }

    @Override
    public void pulsar() {
        this.pulsada = true;
    }

    @Override
    public void soltar() {
        this.pulsada = false;
    }

    @Override
    public void dibujar() {
        if (this.posicion == null || this.graphics == null){
            throw new IllegalStateException("Hay que llamar a setPosicion y " +
                    "setGraphics antes de llamar al método dibujar");
        }

        this.graphics.setColor(this.getColor());
        this.graphics.fillPolygon(this.getVerticexX(),this.getVerticexY(),this.getVerticexX().length);
        this.graphics.setColor(Color.BLACK);
        this.graphics.drawPolygon(this.getVerticexX(),this.getVerticexY(),this.getVerticexX().length);
        this.setPosicion(this.getAnchura(),0);

    }

    @Override
    public void setColorPulsado(Color c) {
        this.colorPulsada = c;
    }

    @Override
    public boolean estaPulsada() {
        return false;
    }

    @Override
    public Color getColorPulsado() {
        return this.colorPulsada;
    }

    @Override
    public abstract Color getColorNoPulsado();

    @Override
    public abstract int getAltura();

    @Override
    public abstract int getAnchura();



}
