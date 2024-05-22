package programa;

import teclas.Tecla;
import teclas.TeclaBlanca;

import java.util.ArrayList;
import java.util.List;

public class MultiPiano extends Piano {
    private List<PianoSencillo> pianos;

    public MultiPiano(int ti, int tf) {
        super(ti, tf);
        this.pianos = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            this.pianos.add(new PianoSencillo(ti, tf));
        }
    }

    public Tecla getTecla(int canal, int nota) {
        return this.pianos.get(canal).getTecla(
                canal, nota
        );
    }

    @Override
    public void dibujar() {
        int x = this.posicion.x;
        int y = this.posicion.y;
        for(int i =0; i<this.pianos.size()/2; i++){
            this.pianos.get(i).setPosicion(x, y);
            this.pianos.get(i).setGraphics(this.graphics);
            this.pianos.get(i).dibujar();
            y += (int) (TeclaBlanca.ALTURA*1.5);
        }
        x += new PianoSencillo(super.getTeclaInicial(),super.getTeclaFinal()).getAnchura();
        y= (int) (this.posicion.y);
        x*=1.2;
        for(int i = 8; i<this.pianos.size(); i++){
            this.pianos.get(i).setPosicion(x, y);
            this.pianos.get(i).setGraphics(this.graphics);
            this.pianos.get(i).dibujar();
            y += (int) (TeclaBlanca.ALTURA*1.5);
        }

    }
}
