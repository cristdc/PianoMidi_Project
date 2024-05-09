package teclas;

public interface Medible extends ElementoVisual{
    public default int getAnchura(){
        throw new UnsupportedOperationException();
    }
    public default int getAltura(){
        throw new UnsupportedOperationException();
    }
}
