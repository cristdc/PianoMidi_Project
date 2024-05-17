package programa;


import bpc.daw.consola.*;

public class Programa {
    public static void main(String[] args) {
        Consola c = new Consola();
        CapaFondo cf = c.getCapaFondo();
        cf.setFondo(new FondoColorSolido(0,0,70));
        CapaTexto ct = c.getCapaTexto();
        ct.print("Dime la ruta del archivo: ");
        Teclado t = c.getTeclado();
        String ruta = t.leerCadenaCaracteres();
        //PianoSencillo p = new PianoSencillo(24,108);
        MultiPiano mp = new MultiPiano(24,108);
        mp.setGraphics(c.getCapaCanvas().getGraphics());
        mp.setPosicion(120,90);
        mp.dibujar();

        ReproductorMidi rM = new ReproductorMidi();
        rM.conectar(mp);
        rM.reproducir(ruta);

    }
}
