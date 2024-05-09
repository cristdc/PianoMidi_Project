package programa;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;
import java.awt.*;

public class ReproductorMidi implements Receiver {
    private static final Color[] COLORES = null;
    private Piano piano;

    public ReproductorMidi() {
        throw new UnsupportedOperationException("no programado");
    }
    public void reproducir(String ruta) {
        throw new UnsupportedOperationException("no programado");
    }
    public void conectar(Piano p) {

    }

    @Override
    public void send(MidiMessage message, long timeStamp) {
        throw new UnsupportedOperationException("no programado");
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("no programado");
    }
}
