package programa;

import teclas.Tecla;

import java.util.List;

public class MultiPiano extends Piano{
    private List<PianoSencillo> pianos;

    public MultiPiano(int ti, int tf) {
        super(ti, tf);
        this.pianos.addAll(List.of(
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf),
                new PianoSencillo(ti, tf)
        ));
    }

    public Tecla getTecla(int canal, int nota) {
        return this.pianos.get(canal).getTecla(
                canal, nota
        );
    }

    @Override
    public void dibujar() {
        throw new UnsupportedOperationException();
    }
}
