package tests;

import org.junit.Test;
import programa.MultiPiano;
import teclas.ElementoVisualTester;

public class MultiPianoTest {
    @Test
    public void test(){
        ElementoVisualTester evt = new ElementoVisualTester(new MultiPiano(30, 80));
        evt.hacerPrueba();
    }
}