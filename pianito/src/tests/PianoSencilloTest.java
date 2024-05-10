package tests;

import org.junit.Test;
import programa.Piano;
import programa.PianoSencillo;
import teclas.ElementoVisualTester;

import static org.junit.Assert.*;

public class PianoSencilloTest {
    @Test
    public void Test1(){
        Piano p = new PianoSencillo(36, 72);

        ElementoVisualTester e = new ElementoVisualTester(p);
        e.hacerPrueba();

    }
}