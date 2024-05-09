package teclas;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;
import java.awt.*;

public class ElementoVisualTester implements Receiver {
    private Graphics graphics;
    private ElementoVisual elemento;

    public ElementoVisualTester(Graphics g, ElementoVisual e) {
        throw new UnsupportedOperationException("no programado");
    }

    public ElementoVisualTester(ElementoVisual e) {
        throw new UnsupportedOperationException("no programado");
    }

    public void hacerPrueba() {
        throw new UnsupportedOperationException("no programado");
    }

    public static void main(String[]  args) {
        throw new UnsupportedOperationException("no programado");
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

