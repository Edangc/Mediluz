
package proyecto_mediluz;

import java.util.LinkedList;

public class GastoMensual {
    private ListaElectrodomesticos electronicosMensuales;
    private int gastoTotalDelMes;
    private String fecha;

    public GastoMensual(ListaElectrodomesticos electronicosMensuales, int gastoTotalDelMes, String fecha) {
        this.electronicosMensuales = electronicosMensuales;
        this.gastoTotalDelMes = gastoTotalDelMes;
        this.fecha = fecha;
    }

    public ListaElectrodomesticos getElectronicosMensuales() {
        return electronicosMensuales;
    }

    public int getGastoTotalDelMes() {
        return gastoTotalDelMes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setElectronicosMensuales(ListaElectrodomesticos electronicosMensuales) {
        this.electronicosMensuales = electronicosMensuales;
    }

    public void setGastoTotalDelMes(int gastoTotalDelMes) {
        this.gastoTotalDelMes = gastoTotalDelMes;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}