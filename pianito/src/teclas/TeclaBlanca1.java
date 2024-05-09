package teclas;

import java.awt.*;

public class TeclaBlanca1 extends TeclaBlanca{

    TeclaBlanca1(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticexX() {
        return new int[]{
                0,
                ANCHURA -(TeclaNegra.ANCHURA/2),
                ANCHURA -(TeclaNegra.ANCHURA/2),
                ANCHURA,
                ANCHURA,
                0
        };
    }

    @Override
    protected int[] getVerticexY() {
        return new int[]{
                0,
                0,
                TeclaNegra.ALTURA,
                TeclaNegra.ALTURA,
                ALTURA,
                ALTURA
        };
    }
}
