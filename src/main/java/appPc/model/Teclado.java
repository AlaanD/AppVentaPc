package appPc.model;

public class Teclado extends DispositivoEntrada{
    private final int ID_TECLADO;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.ID_TECLADO = ++contadorTeclados;
    }

    public int getID_TECLADO() {
        return ID_TECLADO;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "ID_TECLADO=" + ID_TECLADO +
                ", tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
