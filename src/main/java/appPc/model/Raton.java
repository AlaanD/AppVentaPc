package appPc.model;

public class Raton extends DispositivoEntrada{
    private final int ID_RATON;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.ID_RATON = ++contadorRatones;
    }

    public int getID_RATON() {
        return ID_RATON;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "ID_RATON=" + ID_RATON +
                ", tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
