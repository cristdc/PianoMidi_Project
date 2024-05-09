package teclas;

import java.awt.*;

public interface Pulsable extends ElementoVisual{
    public void pulsar();
    public void soltar();
    public boolean estaPulsada();
    public void setColorPulsado(Color c);
    public Color getColorPulsado();
    public Color getColorNoPulsado();
    public default Color getColor(){
        Color pulsado = this.getColorPulsado();
        if (!this.estaPulsada()){
            pulsado = this.getColorNoPulsado();
        }
        return pulsado;
    }
}
