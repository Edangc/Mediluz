
package proyecto_mediluz;

import java.util.LinkedList;

public class ListaGastoMensual {
    private final LinkedList<GastoMensual> listaGastoMensual;

    public ListaGastoMensual(LinkedList<GastoMensual> listaGastoMensual) {
        this.listaGastoMensual = listaGastoMensual;
    }

    public LinkedList<GastoMensual> getListaGastoMensual() {
        return listaGastoMensual;
    }
    
}
