package teclas;

public class TeclaFactory {
    private TeclaFactory(){

    }
    public static Tecla crearTecla(int nota){
        int tipo = nota % 12;

        switch (tipo) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
                return new TeclaNegra(nota);
            case 0:
            case 5:
                return new TeclaBlanca1(nota);
            case 2:
            case 7:
            case 9:
                return new TeclaBlanca2(nota);
            case 4:
            case 11:
                return new TeclaBlanca3(nota);
            default:
                throw new IllegalArgumentException("Número de nota musical inválido: " + nota+ ". Los parámetros de notas musicales son del 1 al 11");
        }
    }
}
