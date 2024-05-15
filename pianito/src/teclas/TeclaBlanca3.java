package teclas;

public class TeclaBlanca3 extends TeclaBlanca{
    TeclaBlanca3(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticexX() {
        return new int[]{
                this.posicion.x,
                this.posicion.x+ANCHURA -(TeclaNegra.ANCHURA),
                this.posicion.x+ANCHURA -(TeclaNegra.ANCHURA),
                this.posicion.x+ANCHURA,
                this.posicion.x+ANCHURA,
                this.posicion.x
        };
    }

    @Override
    protected int[] getVerticexY() {
        return new int[]{
                this.posicion.y+TeclaNegra.ALTURA,
                this.posicion.y+TeclaNegra.ALTURA,
                this.posicion.y,
                this.posicion.y,
                this.posicion.y+ALTURA,
                this.posicion.y+ALTURA
        };
    }
}
