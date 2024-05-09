package programa;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;
import java.awt.*;

public class ReproductorMidi implements Receiver {
    private static final Color[] COLORES = {
            Color.red,Color.green,Color.blue,Color.pink,
            Color.orange,Color.magenta,Color.cyan,Color.yellow,
            new Color(157,19,85),new Color(170,247,46),new Color(81,22,105),new Color(199,1,221),
            new Color(43,222,207),new Color(203,51,130),new Color(155,95,234),new Color(255,198,83)
    };
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
