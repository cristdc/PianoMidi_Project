package programa;

import teclas.*;

import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano implements Medible{
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

            teclas.get(i).setPosicion(posicion.x+ancho, posicion.y);
            teclas.get(i).dibujar();
            if(teclas.get(i) instanceof TeclaBlanca1){
                ancho+=teclas.get(i).getAnchura()-TeclaNegra.ANCHURA/2;
            }

            if(teclas.get(i) instanceof TeclaBlanca2){
                ancho+=teclas.get(i).getAnchura()-TeclaNegra.ANCHURA/2;
            }

            if(teclas.get(i) instanceof TeclaBlanca3){
                ancho+=teclas.get(i).getAnchura();
            }

            if(teclas.get(i) instanceof TeclaNegra){
                ancho+=teclas.get(i).getAnchura()/2;
            }
        }
    }

    @Override
    public int getAnchura() {
        int ancho = 0;
        for (int i = 1; i <= this.teclas.size(); i++){
            if (this.teclas.get(i) instanceof TeclaBlanca){
                ancho += this.teclas.get(i).getAnchura();
            }
        }
        return ancho;
    }

    @Override
    public int getAltura() {
        return TeclaBlanca.ALTURA;
    }
}
