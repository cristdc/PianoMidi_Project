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

    @Override
    public Tecla getTecla(int canal, int nota) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dibujar() {
        throw new UnsupportedOperationException();
    }
}
