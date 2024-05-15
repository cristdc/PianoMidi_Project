package programa;

import teclas.*;

import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;

    public PianoSencillo(int teclaInicial, int teclaFinal){
        super(teclaInicial,teclaFinal);
        this.teclas = new HashMap<>();
        for (int i = teclaInicial; i<teclaFinal; i++){
            Tecla tecla = TeclaFactory.crearTecla(i);
            teclas.put(i, tecla);
        }
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return this.teclas.get(nota);
    }

    @Override
    public void dibujar() {
        int ancho = 0;
        for (int i = getTeclaInicial(); i<getTeclaFinal(); i++){
            teclas.get(i).setGraphics(this.graphics);

            if(teclas.get(i) instanceof TeclaBlanca1){
                teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);

            }else if (teclas.get(i) instanceof TeclaBlanca2) {
                teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);

            }else if(teclas.get(i) instanceof TeclaBlanca3){
                teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);

            }else if(teclas.get(i) instanceof TeclaNegra){
                teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);
            }


            //teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);
            teclas.get(i).dibujar();
            ancho+=teclas.get(i).getAnchura();
        }
    }
}
