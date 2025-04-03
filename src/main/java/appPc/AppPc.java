package appPc;

import appPc.model.Computadora;
import appPc.model.Monitor;
import appPc.model.Raton;
import appPc.model.Teclado;
import appPc.service.Orden;

import java.util.ArrayList;
import java.util.List;

public class AppPc {
    public static void main(String[] args) {
        Raton raton = new Raton("bluetooth",
                "redragon");
        System.out.println(raton);

        Teclado teclado = new Teclado("bluetooth",
                "redragon");
        System.out.println(teclado);

        Monitor monitor = new Monitor("Samsung", 27);
        System.out.println(monitor);

        Computadora pc = new Computadora("Asus");
        pc.setMonitor(monitor);
        pc.setRaton(raton);
        pc.setTeclado(teclado);
        System.out.println(pc);

        Computadora pc1 = new Computadora("Lenovo");
        pc1.setMonitor(monitor);
        pc1.setRaton(raton);
        pc1.setTeclado(teclado);

        Computadora pc2 = new Computadora("Acer");
        pc2.setMonitor(monitor);
        pc2.setRaton(raton);
        pc2.setTeclado(teclado);

        List<Computadora> listaPc = new ArrayList<>();
        Orden orden = new Orden(listaPc);
        orden.agregarPc(pc);
        orden.agregarPc(pc1);
        orden.agregarPc(pc2);
        System.out.println(orden);
    }
}
