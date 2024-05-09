package teclas;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import programa.PianoSencillo;

import java.awt.*;
import java.io.IOException;

public class ElementoVisualTester{
    private Graphics graphics;
    private ElementoVisual elemento;

    public ElementoVisualTester(Graphics g, ElementoVisual e) {
        this.graphics = g;
        this.elemento = e;
        this.elemento.setGraphics(graphics);
    }

    public ElementoVisualTester(ElementoVisual e) {
        Consola c = new Consola();
        CapaFondo cf = c.getCapaFondo();
        cf.setFondo(new FondoColorSolido(Color.gray));
        this.graphics = c.getCapaCanvas().getGraphics();
        this.elemento.setGraphics(this.graphics);
    }

    public void hacerPrueba() {
        this.elemento.setPosicion(120,90);
        this.elemento.setGraphics(this.graphics);
        this.elemento.dibujar();
        if (this.elemento instanceof Pulsable pulsable) {
            pulsable.setColorPulsado(Color.blue);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException error) {
                System.out.println(error);
            }
            pulsable.pulsar();
            pulsable.dibujar();
            try {
                Thread.sleep(2000);
            }catch (InterruptedException error) {
                System.out.println(error);
            }
            pulsable.soltar();
            pulsable.dibujar();
            try {
                Thread.sleep(2000);
            }catch (InterruptedException error) {
                System.out.println(error);
            }
        }
    }

    public static void main(String[]  args) {
        ElementoVisualTester evt = new ElementoVisualTester(new PianoSencillo(1,8));
        evt.hacerPrueba();
    }
}

