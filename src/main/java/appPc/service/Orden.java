package appPc.service;

import appPc.model.Computadora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Orden {
    private final int ID_ORDEN;
    private List<Computadora> listPc;
    private static int contadorOrdenes;

    private Orden(){
        this.ID_ORDEN = ++contadorOrdenes;
    }

    public Orden(List<Computadora> listPc) {
        this();
        this.listPc = listPc;
    }

    public void agregarPc(Computadora pc){
        listPc.add(pc);
    }

    public String mostrarOrden() {
        return """
           \t\t{
           \t\t%s
           \t\t}
           """.formatted(
                listPc.stream()
                        .map(Computadora::toString)
                        .collect(Collectors.joining(",\n\t\t"))
        );
    }

    public int getID_ORDEN() {
        return ID_ORDEN;
    }

    public List<Computadora> getListPc() {
        return listPc;
    }

    @Override
    public String toString() {
        return """
           Orden {
           \tID_ORDEN=%d,
           \tListaPc=%s
           }
           """.formatted(ID_ORDEN, mostrarOrden());
    }

}
