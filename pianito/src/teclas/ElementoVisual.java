package teclas;

import java.awt.*;

public interface ElementoVisual {
    public default void setPosicion(int x, int y){
        throw new UnsupportedOperationException();
    }
    public default void setGraphics(Graphics g){
        throw new UnsupportedOperationException();
    }
    public default void dibujar(){
        throw new UnsupportedOperationException();
    }
}
