package programa;

import teclas.Tecla;

import javax.sound.midi.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;

public class ReproductorMidi implements Receiver {
    private static final Color[] COLORES = {
            Color.red, Color.green, Color.blue, Color.pink,
            Color.orange, Color.magenta, Color.cyan, Color.yellow,
            new Color(157, 19, 85), new Color(170, 247, 46), new Color(81, 22, 105), new Color(199, 1, 221),
            new Color(43, 222, 207), new Color(203, 51, 130), new Color(155, 95, 234), new Color(255, 198, 83)
    };
    private Piano piano;

    public ReproductorMidi() {
        this.piano = null;
    }

    public void reproducir(String ruta) {
        try {
            Sequence s = MidiSystem.getSequence(new File(ruta));
            Sequencer sr = MidiSystem.getSequencer();
            sr.open();

            Transmitter tr = sr.getTransmitter();

            tr.setReceiver(this);

            sr.setSequence(s);
            sr.start();

            Thread.sleep(s.getMicrosecondLength());
            tr.close();
            sr.close();

        } catch (InvalidMidiDataException | InterruptedException | MidiUnavailableException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void conectar(Piano p) {
        this.piano = p;
    }

    @Override
    public void send(MidiMessage message, long timeStamp) {
        if (message instanceof ShortMessage shortMessage) {
            int canal = shortMessage.getChannel();

            if (canal != 9) {
                int notaMus = shortMessage.getData1();
                int volumen = shortMessage.getData2();
                int comando = shortMessage.getCommand();
                Tecla tecla = this.piano.getTecla(canal, notaMus);

                if (tecla != null) {
                    if (comando == ShortMessage.NOTE_ON && volumen > 0) {
                        tecla.pulsar();
                        tecla.setColorPulsado(ReproductorMidi.COLORES[canal]);
                    } else if (comando == ShortMessage.NOTE_OFF || (comando == ShortMessage.NOTE_ON && volumen == 0)) {
                        tecla.soltar();
                    }
                    tecla.dibujar();
                }
            }
        }
    }


    @Override
    public void close() {

    }
}