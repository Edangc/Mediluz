
package proyecto_mediluz;

import java.util.LinkedList;

public class ListaElectrodomesticos {
    private LinkedList<Electrodomestico> listaElectrodomestico;

    public ListaElectrodomesticos(LinkedList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }

    public LinkedList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(LinkedList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }
    
    
}
