package tests;

import org.junit.Test;
import programa.Piano;
import programa.PianoSencillo;
import teclas.ElementoVisualTester;
import teclas.TeclaBlanca;

import static org.junit.Assert.*;

public class PianoSencilloTest {
    @Test
    public void Test1(){
        PianoSencillo p = new PianoSencillo(36, 72);

        ElementoVisualTester e = new ElementoVisualTester(p);
        e.hacerPrueba();

    }

    @Test
    public void Test2(){
        PianoSencillo p = new PianoSencillo(36, 48);
        assertEquals(325, p.getAnchura());
        assertEquals(100, p.getAltura());
    }
}