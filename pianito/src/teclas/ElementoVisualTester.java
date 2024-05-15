package teclas;

import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import programa.PianoSencillo;

import java.awt.*;

public class ElementoVisualTester{
    private Graphics graphics;
    private ElementoVisual elemento;

    public ElementoVisualTester(Graphics g, ElementoVisual e) {
        this.graphics = g;
        this.elemento = e;
        this.elemento.setGraphics(graphics);
    }

    public ElementoVisualTester(ElementoVisual e) {
        this.elemento=e;
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
            try {
                pulsable.setColorPulsado(Color.blue);
                Thread.sleep(2000);
                pulsable.pulsar();
                pulsable.dibujar();
                Thread.sleep(2000);
                pulsable.soltar();
                pulsable.dibujar();
                Thread.sleep(2000);
            }catch (InterruptedException error) {
                System.out.println(error.getMessage());
            }
        }else{
            try {
                Thread.sleep(6000);
            }catch (InterruptedException error){
                System.out.println(error.getMessage());
            }
        }
    }

    public static void main(String[]  args) {
        ElementoVisualTester evt = new ElementoVisualTester(new PianoSencillo(1,8));
        evt.hacerPrueba();
    }
}

