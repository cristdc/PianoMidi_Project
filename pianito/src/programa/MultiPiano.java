package programa;

import teclas.Tecla;

import java.util.ArrayList;
import java.util.List;

public class MultiPiano extends Piano{
    private List<PianoSencillo> pianos;

    public MultiPiano(int ti, int tf) {
        super(ti, tf);
        this.pianos = new ArrayList<>();
        for(int i = 0; i<16; i++){
            this.pianos.add(new PianoSencillo(ti,tf));
        }
    }

    public Tecla getTecla(int canal, int nota) {
        return this.pianos.get(canal).getTecla(
                canal, nota
        );
    }

    @Override
    public void dibujar() {
        for(int i =0; i<this.pianos.size(); i++){

        }
    }
}
