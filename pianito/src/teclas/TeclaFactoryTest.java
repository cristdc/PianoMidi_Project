package teclas;

import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;

import java.awt.*;

import static org.junit.Assert.*;

public class TeclaFactoryTest {
    public static void main(String[] args) {
        Consola c = new Consola();
        CapaFondo cf = c.getCapaFondo();
        cf.setFondo(new FondoColorSolido(Color.gray));

        for(int i= 60; i< 65; i++) {
            Tecla t =TeclaFactory.crearTecla(i);
            ElementoVisualTester evt= new ElementoVisualTester(c.getCapaCanvas().getGraphics(),t);
            evt.hacerPrueba();
        }
    }
}