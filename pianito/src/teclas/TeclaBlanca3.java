package teclas;

public class TeclaBlanca3 extends TeclaBlanca{
    TeclaBlanca3(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticexX() {
        return new int[]{
                0,
                ANCHURA -(TeclaNegra.ANCHURA),
                ANCHURA -(TeclaNegra.ANCHURA),
                ANCHURA,
                ANCHURA,
                0
        };
    }

    @Override
    protected int[] getVerticexY() {
        return new int[]{
                TeclaNegra.ALTURA,
                TeclaNegra.ALTURA,
                0,
                0,
                ALTURA,
                ALTURA
        };
    }
}
