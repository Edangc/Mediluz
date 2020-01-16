
package proyecto_mediluz;

public class GastoMensual {
    private ListaElectrodomesticos electronicosMensuales;
    private int gastoTotalDelMes;

    public GastoMensual(ListaElectrodomesticos electronicosMensuales, int gastoTotalDelMes) {
        this.electronicosMensuales = electronicosMensuales;
        this.gastoTotalDelMes = gastoTotalDelMes;
    }

    public ListaElectrodomesticos getElectronicosMensuales() {
        return electronicosMensuales;
    }

    public int getGastoTotalDelMes() {
        return gastoTotalDelMes;
    }

    public void setElectronicosMensuales(ListaElectrodomesticos electronicosMensuales) {
        this.electronicosMensuales = electronicosMensuales;
    }

    public void setGastoTotalDelMes(int gastoTotalDelMes) {
        this.gastoTotalDelMes = gastoTotalDelMes;
    }
    
    
}
