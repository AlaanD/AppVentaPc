package appPc.model;

public class Computadora {
    private final int ID_COMPUTADORA;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    private Computadora(){
        this.ID_COMPUTADORA = ++contadorComputadoras;
    }

    public Computadora(String nombre){
        this();
        this.nombre = nombre;
    }

    public Computadora(int ID_COMPUTADORA, String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this(nombre);
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public int getID_COMPUTADORA() {
        return ID_COMPUTADORA;
    }

    @Override
    public String toString() {
        return """
           \tComputadora {
           \t\tID_COMPUTADORA=%d,
           \t\tnombre='%s',
           \t\tmonitor=%s,
           \t\tteclado=%s,
           \t\traton=%s
           \t}
           """.formatted(ID_COMPUTADORA, nombre, monitor, teclado, raton);
    }

}
