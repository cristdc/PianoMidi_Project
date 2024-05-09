package teclas;

public class TeclaBlanca2 extends TeclaBlanca{
    TeclaBlanca2(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticexX() {
        return new int[]{
                0,
                TeclaNegra.ANCHURA/2,
                TeclaNegra.ANCHURA/2,
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
                TeclaNegra.ALTURA,
                TeclaNegra.ALTURA,
                0,
                0,
                TeclaNegra.ALTURA,
                TeclaNegra.ALTURA,
                ALTURA,
                ALTURA
        };
    }
}
